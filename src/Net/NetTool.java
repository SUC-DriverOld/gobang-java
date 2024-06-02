package Net;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class NetTool {
    public static void sendUdpBroadCast(String ip, String msg) {
        try {
            MulticastSocket ms = new MulticastSocket();
            InetAddress ia = InetAddress.getByName(ip);
            DatagramPacket dp = new DatagramPacket(msg.getBytes(), 0, msg.length(), ia, 1111);
            ms.send(dp);
            ms.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
