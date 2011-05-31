package org.lxh.interruptdemo;

class MyThread implements Runnable {
	public void run() {
		System.out.println("1������run()������");
		try {
			System.out.println("2���߳�����20����");
			Thread.sleep(20000); // ÿ������20��
			System.out.println("3���߳���������20����");
		} catch (InterruptedException e) {
			System.out.println("4���߳����߱��ж�");
			return;// ���ط������ô�
		}
		System.out.println("5����������run()������");
	}

}

public class InterruptDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread thread = new Thread(mt, "�߳�A");
		thread.start();// �����߳�
		try {
			Thread.sleep(2000); // ��֤��������ִ��2��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt(); // �ж�
	}

}
