/*
 * 1.聊天小程序，首先显示简单的界面
 * 2.设置输入框和显示框
 * 3.点击关闭可以实现关闭事件
 * 4.输入框实现输入后回车并在显示框中显示出来
 * 5.编写服务端，接受用户连接
 * 6.客户端连接到服务器端；服务端读取客户端输入的文字
 * @7.服务端读取客户端输入的文字
 * 8.对第二次输入出现Socket is closed的处理;服务器端第二次收不到
 * 9.客户端输入完关闭时，服务器端出现EOFException
 * @10.连上多个客户端，解决第二个客户端可以连上的问题（被readUTF阻塞了）使用线程
 * 11.把客户端发过来的信息通过服务器转发给客户
 * 12.客户端可以接收服务器发来的消息;修正关闭时出错
 * 13.修正bug：关掉其中一个，另外一个客户端往外发信息时服务端会出错
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class ChatClient extends Frame {
	TextField tf = new TextField();//设置文字输入框
	TextArea ta = new TextArea();//设置文字显示区域
	Socket s = null;
	DataOutputStream dos = null;
	DataInputStream dis = null;
	private boolean bConnected = false;
	Thread tRecv = new Thread(new RecvThread());
	public static void main(String[] args) {
		new ChatClient().launchFrame();
	}

	private void launchFrame() {
		this.setLocation(700,200);//设置位置
		this.setSize(300,300);//设置大小
		add(tf,BorderLayout.SOUTH);//文字输入框设置在下面（南）
		add(ta,BorderLayout.NORTH);//文字显示框设置在上面（北）
		pack();//可以去除上下两个框之间的空白处
		this.addWindowListener(new WindowAdapter() {//窗口监听new一个窗口适配器
			public void windowClosing(WindowEvent e) {//重写closing方法
				disconnect();
				System.exit(0);//exit(0)为正常退出
			}
		});
		tf.addActionListener(new tfListener());//文字输入框的动作监听
		setVisible(true);//设置可见
		connect();
		
		tRecv.start();
	}
	
	public void connect(){
		try {
			s = new Socket("127.0.0.1",8888);
			dos = new DataOutputStream(s.getOutputStream());
			dis = new DataInputStream(s.getInputStream());
			System.out.println("恭喜，您已连上服务器！");
			bConnected = true;
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void disconnect(){
		try {
			dos.close();
			dis.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 try {
			bConnected = false;
			try {
				tRecv.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			dos.close();
			dis.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
	private class tfListener implements ActionListener{//输入框实现ActionListener监听
		public void actionPerformed(ActionEvent e) {//重写方法
			String str = tf.getText().trim();//设置回车符为结束符号
			//ta.setText(str);//设置显示str
			tf.setText("");//输入框为置空
			try {            //@@@@@@@@@@@@@@@@@@@@@@@important
				dos.writeUTF(str);
				dos.flush();
				//dos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	private class RecvThread implements Runnable{
		public void run() {
				try {
					while(bConnected){
						String str = dis.readUTF();
						//System.out.println(str);
						ta.setText(ta.getText() + str + '\n');
				}
				} catch (SocketException e){
					System.out.println("退出了，bye-bye！");
				}catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
