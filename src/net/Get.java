package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;


/**
 * Get
 *
 * @author guobin201314@gmail.com on 2019-07-09
 */
public class Get {

    static String get(String path) {
        try {
            URL url = new URL(path);
            return Get.send(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return "";
    }

    static String get(String path, HttpParams httpParams) {
        try {
            URL url = new URL(path + httpParams.toString());
            return Get.send(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static String send(URL url) {
        String res = null;
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setConnectTimeout(20000);
            urlConnection.setReadTimeout(60000);
            urlConnection.connect();

            if (urlConnection.getResponseCode() == 200) {
                for (String key: urlConnection.getHeaderFields().keySet()) {
                    System.out.print(key);
                    System.out.println(urlConnection.getHeaderFields().get(key));
                }
                inputStream = urlConnection.getInputStream();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                StringBuilder stringBuilder = new StringBuilder();
                String temp;
                while ((temp = bufferedReader.readLine()) != null) {
                    stringBuilder.append(temp);
                    stringBuilder.append("\r\n");
                }
                res = stringBuilder.toString();
            } else {
                System.out.println(urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != bufferedReader) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != urlConnection) {
                urlConnection.disconnect();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        HttpParams httpParams = new HttpParams();
        httpParams.set("type", "DEVICE_SOURCE_TYPE");

        String res2 = Get.get("http://139.198.13.158:9120/sysDict/findTsysDict", httpParams);
        System.out.println(res2);
    }
}
