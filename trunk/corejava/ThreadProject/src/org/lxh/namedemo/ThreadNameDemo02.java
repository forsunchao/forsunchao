package org.lxh.namedemo;

public class ThreadNameDemo02 {
	public static void main(String[] args) {
		MyThread mt = new MyThread(); // Runnable����ʵ��
		new Thread(mt, "�Զ����߳�").start();
		mt.run() ;	// ֱ��ͨ���������
	}

}
