package org.lxh.diffdemo01;

public class ThreadTicket {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread(); // һ���߳�
		MyThread mt2 = new MyThread(); // һ���߳�
		MyThread mt3 = new MyThread(); // һ���߳�
		mt1.start() ;	// ��ʼ��Ʊ
		mt2.start() ;	// ��ʼ��Ʊ
		mt3.start() ;	// ��ʼ��Ʊ
	}

}
