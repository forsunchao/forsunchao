package org.sunchao.demo01;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7777);
		while (true) {
			Socket s = ss.accept();
			System.out.println("A client is connected...");
			InputStream in = s.getInputStream();
			DataInputStream diStream = new DataInputStream(in);
			System.out.println(diStream.readUTF());
			diStream.close();
			s.close();
		}

	}
}
