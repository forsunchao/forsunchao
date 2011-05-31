/*
 * 5.编写服务端，接受用户连接
 * 6.服务端读取客户端输入的文字
 * @7.服务端读取客户端输入的文字
 * 8.服务器端第二次收不到
 * 9.客户端输入完关闭时，服务器端出现EOFException
 * @10.连上多个客户端，解决第二个客户端可以连上的问题（被readUTF阻塞了）使用线程
 * 11.把客户端发过来的信息通过服务器转发给客户
 * 12.客户端可以接收服务器发来的消息;修正关闭时出错
 * 13.修正bug：关掉其中一个，另外一个客户端往外发信息时服务端会出错
 */
import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
	boolean started = false;
	ServerSocket ss = null;

	List<Client>clients = new ArrayList<Client>();
	public static void main(String[] args) {
		new ChatServer().start();
	}

	public void start() {
		try {
			ss = new ServerSocket(8888);
			started = true;
		} catch (BindException e) {
			System.out.println("端口使用中....");
			System.out.println("请关掉相关程序并重新运行服务器！");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			while (started) {
				Socket s = ss.accept();
				Client c = new Client(s);
				System.out.println("a client connected!");
				new Thread(c).start();
				clients.add(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class Client implements Runnable {
		private Socket s;
		private DataInputStream dis = null;
		private DataOutputStream dos = null;
		private boolean bConnected = false;

		public Client(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
				bConnected = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void send(String str){
			try {
				dos.writeUTF(str);
			} catch (IOException e) {
				clients.remove(this);
				System.out.println("对方退出了！我从List里面去除了！");
			}
		}
		
		public void run() {
			Client c = null;
			try {
				while (bConnected) {
					String str = dis.readUTF();
					System.out.println(str);
					for(int i=0;i<clients.size();i++){
						c = clients.get(i);
						c.send(str);
					}
				}
			} catch (SocketException e){
				//if(c != null) clients.remove(this);
				System.out.println("一个客户下去了！");
			} catch (EOFException e) {
				System.out.println("Client closed!");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (dis != null)
						dis.close();
					if (dos != null)
						dos.close();
					if (s != null)
						s.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
