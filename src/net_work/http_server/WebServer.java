package net_work.http_server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/*
 * WebServer
 * @Author guobin201314@gmail.com on 2019-06-05 15:23
 */
public class WebServer {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8888), 0);
            server.createContext("/", new IndexRouter());
            server.createContext("/index", new IndexRouter());
            server.start();
            System.out.println("server start on port 8888");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
