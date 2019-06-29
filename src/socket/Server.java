package socket;

import java.io.IOException;


/**
 * Server class
 *
 * @author GuoBin guobin201314@gmail.com
 * @date 2019-06-28
 */
public class Server {

    public static void main(String[] args) {
        System.out.println("http://127.0.0.1:9996");
        SocketServer socketServer;
        try {
            socketServer = new SocketServer(12011);
            socketServer.run();
//            socketServer.sendMessage("推送消息");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
