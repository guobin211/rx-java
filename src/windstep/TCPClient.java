package windstep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author GuoBin201314@gmail.com on 2018/11/18 14:27
 */
public class TCPClient {
    public static void main(String[] args) {
        InetAddress address = InetAddress.getLoopbackAddress();
        try (Socket socket = new Socket(address, 9999)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }
    }
}
