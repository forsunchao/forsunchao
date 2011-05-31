package test.OutputStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestPipedOutputStream {

	public static void main(String[] args) {
		try {
			// 创建发送者线程
			Sender t1 = new Sender();
			PipedOutputStream out = t1.getOutputStream();
			// 创建接收者线程
			Receiver t2 = new Receiver();
			PipedInputStream in = t2.getInputStream();
			// 连接管道流
			out.connect(in);

			// 启动发送者线程和接收者线程
			new Thread(t1).start();
			new Thread(t2).start();
		} catch (Exception e) {

		}
	}
}

// 发送者线程类
class Sender extends Thread {
	private PipedOutputStream out = new PipedOutputStream();

	public PipedOutputStream getOutputStream() {
		return out;
	}

	public void run() {
		// 发送字符串
		String s = new String("hello,receiver,how are you");
		try {
			out.write(s.getBytes());
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

// 接收者线程
class Receiver extends Thread {
	private PipedInputStream in = new PipedInputStream();

	public PipedInputStream getInputStream() {
		return in;
	}

	public void run() {
		// 接收字符串
		String s = null;
		byte[] buf = new byte[1024];
		try {
			int len = in.read(buf);
			s = new String(buf, 0, len);
			System.out.println("from:\n" + s);
			in.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}