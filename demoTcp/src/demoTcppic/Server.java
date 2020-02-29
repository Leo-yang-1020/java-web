package demoTcppic;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedInputStream;
import java.io.FileOutputStream; 

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(12345);
		Socket socket=server.accept();
		InputStream is=socket.getInputStream();	
		FileOutputStream fos=new FileOutputStream("接受后的文件.png");
		byte []b=new byte[1024];
		int len=0;
		while((len=is.read(b))!=-1) {
			fos.write(b,0,len);
		}
		fos.close();
		is.close();
	}
}
