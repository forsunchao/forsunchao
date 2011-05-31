package org.sunchao.demo01;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 7777);
		OutputStream oStream = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(oStream);
		dos.writeUTF("我开始连接了啊");
		dos.flush();
		dos.close();
		s.close();
	}
}
