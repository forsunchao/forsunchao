/*package org.lxh.syndemo;

class MyTicketThread implements Runnable {// ʵ��Runnable�ӿ�
	private int ticket = 5; // һ����5��Ʊ

	public void run() {// ��дrun()����
		for (int i = 0; i < 50; i++) {// ��ʾѭ��10��
			synchronized (this) {// �γ�ͬ�������
				if (this.ticket > 0) {
					try {
						Thread.sleep(300);// �ӳ�
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("��Ʊ��ticket = " + this.ticket--);
				}
			}
		}
	}
}

public class SynDemo02 {
	public static void main(String[] args) {
		MyTicketThread mt = new MyTicketThread(); // һ���߳�
		new Thread(mt, "Ʊ����-A ").start(); // ��ʼ��Ʊ
		new Thread(mt, "Ʊ����-B ").start(); // ��ʼ��Ʊ
		new Thread(mt, "Ʊ����-C ").start(); // ��ʼ��Ʊ
	}
}
*/