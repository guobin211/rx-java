package net.http_server;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.HttpCookie;
import java.util.Set;

/**
 * IndexRouter
 * @Author guobin201314@gmail.com on 2019-06-06 15:12
 */
public class IndexRouter implements HttpHandler {
    private String html;

    IndexRouter() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(
                    "/Users/guobin/idea/rx-java/src/net/http_server/index.html"
            )));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s);
                stringBuilder.append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.html = stringBuilder.toString();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // method
        String requestMethod = exchange.getRequestMethod();
        // requestHeaders
        Headers requestHeaders = exchange.getRequestHeaders();
        // request body
        InputStream requestBody = exchange.getRequestBody();
        // responseHeaders
        Headers responseHeaders = exchange.getResponseHeaders();
        // body部分
        OutputStream responseBody = exchange.getResponseBody();
        if (requestMethod.equalsIgnoreCase("GET")) {
            responseHeaders.set("Connection", "keep-alive");
//            responseHeaders.set("Content-Type", "text/plain");
            responseHeaders.set("Content-Type", "text/html; charset=utf-8");
            responseHeaders.set("Access-Control-Allow-Origin", "*");
            responseHeaders.set("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
            responseHeaders.set("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Token, " +
                    "Accept, Authorization, Access-Control-Allow-Credentials");
            responseHeaders.set("Access-Control-Allow-Credentials", "true");
            // set cookie
            HttpCookie cookie = new HttpCookie("visitTime", System.currentTimeMillis() + "");
            cookie.setDomain("http://127.0.0.1:8888");
            cookie.setPath("/");
            responseHeaders.set("Set-Cookie", cookie.toString());
            exchange.sendResponseHeaders(200, 0);
            Set<String> keySet = requestHeaders.keySet();
//            for (String key : keySet) {
//                List values = requestHeaders.get(key);
//                String s = key + "=" + values.toString() + "\n";
//                responseBody.write(s.getBytes());
//                System.out.println(key);
//                if ("Token".equals(key)) {
//                    System.out.println(requestHeaders.get(key));
//                }
//            }
            responseBody.write(this.html.getBytes());
            responseBody.close();
        } else if (requestMethod.equalsIgnoreCase("POST")) {
            responseHeaders.set("Content-Type", "text/plain");
            exchange.sendResponseHeaders(200, 0);
            responseBody.write("Post Method".getBytes());
            responseBody.close();
        }
    }
}
