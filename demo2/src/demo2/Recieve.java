package demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Recieve {
	public static void main(String args[]) {
		DatagramSocket ds=null;
		try {
			ds=new DatagramSocket(3456);
			while(true) {
				byte []buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf,buf.length);
				try {
					ds.receive(dp);//阻塞方法，等待数据传输
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				byte []b=dp.getData();
				System.out.println(new String(b,0,dp.getLength()));
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
