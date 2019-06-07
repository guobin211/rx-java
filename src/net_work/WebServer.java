package net_work;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * WebServer
 * @Author guobin201314@gmail.com on 2019-06-05 14:51
 */
public class WebServer {
    public static void main(String[] args) {
        System.out.println("Web Server...");
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String hostName = inetAddress.getHostName();
            System.out.println("ip: " + inetAddress.getHostAddress() + hostName);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
