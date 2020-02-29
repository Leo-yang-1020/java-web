package demoTcppic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket client=new Socket("192.168.2.169", 12345);//ip地址
	OutputStream os=client.getOutputStream();
	FileInputStream fis=new FileInputStream("D:\\大一下课表.png");
	byte []b=new byte[1024];
	int len=0;
	while((len=fis.read(b))!=-1) {
		os.write(b,0,len);
	}
	fis.close();
	client.close();
}
}
