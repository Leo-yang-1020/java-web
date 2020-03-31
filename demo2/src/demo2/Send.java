package demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Send {
	public static void main(String args[]) {
		
		DatagramSocket ds=null;
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			ds=new DatagramSocket();
			
			String line="";
			try {
				while((line=br.readLine())!=null) {
					if(line.equals("886")) {//这里表示如果886就退出
						break;
					}
					InetAddress address=InetAddress.getByName("192.168.1.102");
					DatagramPacket dp=new DatagramPacket(line.getBytes(),line.length(),address,3456);
					ds.send(dp);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(ds!=null)
				ds.close();
		}
	}
}
