package demoTcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class Client {
public static void main(String args[]) {
	/*
	 * 1.创建客户端socket对象
	 * 2.建立链接
	 * 3.通过io流在管道里传输
	 * 4.关闭socket
	 */
	try {
		Socket client =new Socket("192.168.1.103",34567);//此时已经建立链接
		OutputStream os=client.getOutputStream();
		os.write("tcp协议编程".getBytes());
		client.close();
	}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
}
}
