package demoTcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class Client {
public static void main(String args[]) {
	/*
	 * 1.�����ͻ���socket����
	 * 2.��������
	 * 3.ͨ��io���ڹܵ��ﴫ��
	 * 4.�ر�socket
	 */
	try {
		Socket client =new Socket("192.168.1.103",34567);//��ʱ�Ѿ���������
		OutputStream os=client.getOutputStream();
		os.write("tcpЭ����".getBytes());
		client.close();
	}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
}
}
