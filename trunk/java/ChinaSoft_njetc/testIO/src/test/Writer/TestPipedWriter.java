package test.Writer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class TestPipedWriter {

	public static void main(String[] args) {
		try {
			// 创建发送者线程
			Sender t1 = new Sender();
			PipedWriter out = t1.getWriter();
			// 创建接收者线程
			Receiver t2 = new Receiver();
			PipedReader in = t2.getReader();
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
	private PipedWriter out = new PipedWriter();

	public PipedWriter getWriter() {
		return out;
	}

	public void run() {
		// 发送字符串
		String s = new String("hello,receiver,how are you");
		try {
			out.write(s);
			out.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

// 接收者线程
class Receiver extends Thread {
	private PipedReader in = new PipedReader();

	public PipedReader getReader() {
		return in;
	}

	public void run() {
		// 接收字符串
		String s = null;
		char[] buf = new char[1024];
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