package org.lxh.threaddemo;

public class ThreadDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("�߳�A") ;
		MyThread mt2 = new MyThread("�߳�B") ;
		mt1.run() ;	// �����߳���
		mt2.run() ;	// �����߳���
	}
}
