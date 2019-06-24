package net.http_server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * WebServer
 * @Author guobin201314@gmail.com on 2019-06-05 15:23
 */
public class WebServer {
    public static void main(String[] args) {
        IndexRouter indexRouter = new IndexRouter();
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8888), 0);
            server.createContext("/", indexRouter);
            server.createContext("/index", indexRouter);
            server.start();
            System.out.println("server start on port 8888");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
