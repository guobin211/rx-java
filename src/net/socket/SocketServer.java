package net.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * SocketServer
 * @Author guobin201314@gmail.com on 2019-06-05 14:52
 */
public class SocketServer extends Thread {
    private ServerSocket serverSocket;

    public SocketServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(15000);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                System.out.println(dataInputStream.readUTF());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeUTF("欢迎连接socket：" + socket.getLocalSocketAddress());
                socket.close();
                System.out.println("Server close");
            } catch (SocketTimeoutException s) {
                System.out.println("socket timeout");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
