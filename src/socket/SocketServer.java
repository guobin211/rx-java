package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.HashMap;

/**
 * SocketServer class
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-28
 */
public class SocketServer extends Thread {

    public HashMap<SocketAddress, Socket> sockets;

    ServerSocket serverSocket;
    SocketServer(Integer port) throws IOException {
        this.sockets = new HashMap<>();
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(100000);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("正在监听端口:" + serverSocket.getLocalPort() + "...");
            try {
                Socket socket = serverSocket.accept();
                System.out.println("当前连接上的远程地址： " + socket.getRemoteSocketAddress());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                System.out.println("接收到消息： " + dataInputStream.readUTF());

                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeUTF("欢迎连接 socket server: " + serverSocket.getLocalSocketAddress());
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 连线
     * @param socket 客户端
     */
    private void handleOnline(Socket socket) {
        this.sockets.put(socket.getRemoteSocketAddress(), socket);
    }

    /**
     * 离线
     */
    private void handleLeave() {

    }

    /**
     * 发送消息
     * @param msg string
     */
    public void sendMessage(String msg) {
        for (Socket socket: sockets.values()) {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
