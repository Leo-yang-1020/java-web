package demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
	/*
	 * 1.创建对象，指定接收方，需要提供端口
	 * 2.创建一个数据包
	 * 3.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds=null;
		
		try {
			ds=new DatagramSocket(10086);//指定某个端口接收
			byte []buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			System.out.println(dp.getPort());
			System.out.println(dp.getAddress());
			byte []b=dp.getData();
			System.out.println(new String(b,0,dp.getLength()));//得到准确的长度
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
