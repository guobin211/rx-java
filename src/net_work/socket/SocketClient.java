package net_work.socket;

import java.io.*;
import java.net.Socket;

/*
 * SocketClient
 * @Author guobin201314@gmail.com on 2019-06-05 14:52
 */
public class SocketClient {
    public static void main(String[] args) {
        String serverName = "127.0.0.1";
        int port = 5500;
        try {
            Socket socket = new Socket(serverName, port);
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeUTF("hello from " + socket.getLocalSocketAddress());
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("服务器响应：" + dataInputStream.readUTF());
            socket.close();
            System.out.println("client close");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
