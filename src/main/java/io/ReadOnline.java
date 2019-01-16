package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * io   ReadOnline
 *
 * @author guobin201314@gmail.com on 2019-01-16
 * @version  1.0.0
 */
public class ReadOnline {

    public static void main(String[] args) {
        MyVersion myVersion = new MyVersion();
        myVersion.setVersion("1.0.2");
        System.out.println(myVersion.toString());
        System.out.println(myVersion.getVersion());

        String api = "https://www.baidu.com/";
        readHtml(api);

        api = "https://oa.yuetaosem.com/assets/config.json";
        readJson(api);
    }

    static void readHtml(String path) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        String res = null;

        try {
            URL url = new URL(path);
            try {
                connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(10000);
                connection.setReadTimeout(6000);
                connection.connect();

                if (connection.getResponseCode() == 200) {
                    inputStream = connection.getInputStream();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                    StringBuilder stringBuilder = new StringBuilder();
                    String temp;
                    while ((temp = bufferedReader.readLine()) !=null) {
                        stringBuilder.append(temp);
                        stringBuilder.append("\r\n");
                    }
                    res = stringBuilder.toString();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            assert connection != null;
            connection.disconnect();
        }

        System.out.println(res);
    }

    static void readJson(String path) {

        StringBuilder stringBuilder = new StringBuilder();

        try {
            URL url = new URL(path);
            try {
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();
                if (urlConnection.getResponseCode() == 200) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    String inputString;
                    while ((inputString = bufferedReader.readLine()) != null) {
                        stringBuilder.append(inputString);
                    }
                    bufferedReader.close();
                }
                urlConnection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuilder);

    }
}
