package org.lxh.threaddemo;

public class ThreadDemo02 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("�߳�A");
		MyThread mt2 = new MyThread("�߳�B");
		mt1.start(); // �����߳���
		mt2.start(); // �����߳���

	}

}
