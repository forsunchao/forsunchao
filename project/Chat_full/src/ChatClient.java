/*
 * 1.����С����������ʾ�򵥵Ľ���
 * 2.������������ʾ��
 * 3.����رտ���ʵ�ֹر��¼�
 * 4.�����ʵ�������س�������ʾ������ʾ����
 * 5.��д����ˣ������û�����
 * 6.�ͻ������ӵ��������ˣ�����˶�ȡ�ͻ������������
 * @7.����˶�ȡ�ͻ������������
 * 8.�Եڶ����������Socket is closed�Ĵ���;�������˵ڶ����ղ���
 * 9.�ͻ���������ر�ʱ���������˳���EOFException
 * @10.���϶���ͻ��ˣ�����ڶ����ͻ��˿������ϵ����⣨��readUTF�����ˣ�ʹ���߳�
 * 11.�ѿͻ��˷���������Ϣͨ��������ת�����ͻ�
 * 12.�ͻ��˿��Խ��շ�������������Ϣ;�����ر�ʱ����
 * 13.����bug���ص�����һ��������һ���ͻ������ⷢ��Ϣʱ����˻����
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class ChatClient extends Frame {
	TextField tf = new TextField();//�������������
	TextArea ta = new TextArea();//����������ʾ����
	Socket s = null;
	DataOutputStream dos = null;
	DataInputStream dis = null;
	private boolean bConnected = false;
	Thread tRecv = new Thread(new RecvThread());
	public static void main(String[] args) {
		new ChatClient().launchFrame();
	}

	private void launchFrame() {
		this.setLocation(700,200);//����λ��
		this.setSize(300,300);//���ô�С
		add(tf,BorderLayout.SOUTH);//������������������棨�ϣ�
		add(ta,BorderLayout.NORTH);//������ʾ�����������棨����
		pack();//����ȥ������������֮��Ŀհ״�
		this.addWindowListener(new WindowAdapter() {//���ڼ���newһ������������
			public void windowClosing(WindowEvent e) {//��дclosing����
				disconnect();
				System.exit(0);//exit(0)Ϊ�����˳�
			}
		});
		tf.addActionListener(new tfListener());//���������Ķ�������
		setVisible(true);//���ÿɼ�
		connect();
		
		tRecv.start();
	}
	
	public void connect(){
		try {
			s = new Socket("127.0.0.1",8888);
			dos = new DataOutputStream(s.getOutputStream());
			dis = new DataInputStream(s.getInputStream());
			System.out.println("��ϲ���������Ϸ�������");
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
	private class tfListener implements ActionListener{//�����ʵ��ActionListener����
		public void actionPerformed(ActionEvent e) {//��д����
			String str = tf.getText().trim();//���ûس���Ϊ��������
			//ta.setText(str);//������ʾstr
			tf.setText("");//�����Ϊ�ÿ�
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
					System.out.println("�˳��ˣ�bye-bye��");
				}catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
