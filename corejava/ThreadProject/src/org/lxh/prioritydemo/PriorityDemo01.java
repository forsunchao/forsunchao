package org.lxh.prioritydemo;

class MyThread implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(600) ;	// �ӳٲ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "�߳��������С�");
		}
	}
}

public class PriorityDemo01 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt, "�߳�A");
		Thread t2 = new Thread(mt, "�߳�B");
		Thread t3 = new Thread(mt, "�߳�C");
		t1.setPriority(Thread.NORM_PRIORITY); // ����һ���߳�����Ϊ�е����ȼ�
		t3.setPriority(Thread.MAX_PRIORITY); // ���������߳�����Ϊ������ȼ�
		t2.setPriority(Thread.MIN_PRIORITY); // ���ڶ����߳�����Ϊ������ȼ�
		t1.start();
		t2.start();
		t3.start();
	}
}
