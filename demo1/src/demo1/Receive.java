package demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
	/*
	 * 1.��������ָ�����շ�����Ҫ�ṩ�˿�
	 * 2.����һ�����ݰ�
	 * 3.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds=null;
		
		try {
			ds=new DatagramSocket(10086);//ָ��ĳ���˿ڽ���
			byte []buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			System.out.println(dp.getPort());
			System.out.println(dp.getAddress());
			byte []b=dp.getData();
			System.out.println(new String(b,0,dp.getLength()));//�õ�׼ȷ�ĳ���
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
