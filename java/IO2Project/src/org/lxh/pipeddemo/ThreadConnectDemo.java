package org.lxh.pipeddemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Send implements Runnable {// �������ݵ��߳�
	private PipedOutputStream output = null;

	public Send() {
		this.output = new PipedOutputStream();
	}

	public PipedOutputStream getPipedOutputStream() {
		return this.output;
	}

	public void run() {
		String str = "hello world!!!";// Ҫ���͵�����
		try {
			this.output.write(str.getBytes());// ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.output.close(); // �ر�
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Receive implements Runnable {// �������ݵ��߳�
	private PipedInputStream input = null;

	public Receive() {
		this.input = new PipedInputStream();
	}

	public PipedInputStream getPipedInputStream() {
		return this.input;
	}

	public void run() {
		byte b[] = new byte[1024]; // ��������
		int len = 0;
		try {
			len = this.input.read(b);// ���ݶ�ȡ
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.input.close(); // �ر�
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(new String(b, 0, len));
	}
}

public class ThreadConnectDemo {
	public static void main(String[] args) throws IOException {
		Send send = new Send();
		Receive rec = new Receive();
		send.getPipedOutputStream().connect(rec.getPipedInputStream()); // ���йܵ�����
		new Thread(send).start(); // �����߳�
		new Thread(rec).start(); // �����߳�
	}

}
