package demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Send {

	public static void main(String args[]) {
		/*udp
		 * 1.创建对象
		 * 2.把数据打包
		 * 3.发送
		 */
		try {
			DatagramSocket ds=new DatagramSocket();
			byte []buf="udp协议学习".getBytes();//把数据打包
			InetAddress address=InetAddress.getByName("192.168.1.100");
			DatagramPacket dp=new DatagramPacket(buf,buf.length,address,10086);
			ds.send(dp);
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
