package org.lxh.namedemo;

public class ThreadNameDemo01 {
	public static void main(String[] args) {
		MyThread mt = new MyThread(); // Runnable����ʵ��
		Thread thread1 = new Thread(mt, "�߳�A");
		Thread thread2 = new Thread(mt, "�߳�B");
		Thread thread3 = new Thread(mt, "�߳�C");
		thread1.start() ;
		thread2.start() ;
		thread3.start() ;
	}

}
