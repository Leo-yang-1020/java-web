package demoTcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String args[]) throws IOException {
		/*
		 * 1.����socket����
		 * 2.����socket����
		 * 3.ͨ�����ص�socket�������������
		 */
		ServerSocket server=new ServerSocket(34567);
		Socket socket=server.accept();//˭�����ͷ���˭��socket
		InputStream is=socket.getInputStream();
		byte []b=new byte[1024];
		int len=is.read(b);
		System.out.println(new String(b,0,len));
//		PrintStream output = new PrintStream(socket.getOutputStream());
//		output.print("123");
//		output.close();
		OutputStream os=socket.getOutputStream();
		os.write("123".getBytes());
		server.close();
		
	}
}
