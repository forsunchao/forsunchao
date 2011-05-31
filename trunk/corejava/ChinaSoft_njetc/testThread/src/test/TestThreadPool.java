package test;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
	public static void main(String args[]) {
		boolean flag = true;
		try {
			// 创建线程池
			ExecutorService pool = Executors.newFixedThreadPool(10);
			// 启动服务器
			ServerSocket server = new ServerSocket(12345);

			System.out.println("开始监听");
			while (flag) {
				// 接受客户端连接
				Socket socket = server.accept();
				// 为客户端创建一个独立线程
				pool.execute(new ServiceThread(socket));
			}
			// 关闭
			server.close();
			pool.shutdown();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ServiceThread implements Runnable {
	private Socket socket = null;

	ServiceThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			// 客户端输入输出流
			DataInputStream is = new DataInputStream(new BufferedInputStream(
					socket.getInputStream()));
			OutputStream os = socket.getOutputStream();
			
			// 读取客户端输入
			String inputLine;
			while ((inputLine = is.readLine()) != null) {
				// 当客户端输入bye时关闭客户端连接
				if (inputLine.equals("bye")) {
					break;
				} else {
					System.out.println(inputLine);
					os.write(("reply: " + inputLine).getBytes());
				}
			}
			is.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}