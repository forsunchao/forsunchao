package org.lxh.runnabledemo;

public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("�߳�A");
		MyThread mt2 = new MyThread("�߳�B");
		new Thread(mt1).start(); // �����߳���
		new Thread(mt2).start(); // �����߳���
	}
}
