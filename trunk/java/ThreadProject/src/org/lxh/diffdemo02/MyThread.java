package org.lxh.diffdemo02;

public class MyThread implements Runnable {// ʵ��Runnable�ӿ�
	private int ticket = 5; // һ����5��Ʊ

	public void run() {// ��дrun()����
		for (int i = 0; i < 50; i++) {// ��ʾѭ��10��
			if (this.ticket > 0) {
				System.out.println("��Ʊ��ticket = " + this.ticket--);
			}
		}
	}
}
