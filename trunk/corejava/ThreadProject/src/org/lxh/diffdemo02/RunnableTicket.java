package org.lxh.diffdemo02;

public class RunnableTicket {
	public static void main(String[] args) {
		MyThread mt = new MyThread(); // һ���߳�
		new Thread(mt).start() ;	// ��ʼ��Ʊ
		new Thread(mt).start() ;	// ��ʼ��Ʊ
		new Thread(mt).start() ;	// ��ʼ��Ʊ
	}

}
