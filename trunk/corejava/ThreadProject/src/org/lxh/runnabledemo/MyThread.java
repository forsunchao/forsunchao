package org.lxh.runnabledemo;

public class MyThread implements Runnable { // ʵ��Runnable�ӿ�
	private String name; // ����name����

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {// ��дrun()����
		for (int i = 0; i < 50; i++) {// ��ʾѭ��10��
			System.out.println("Thread���У�" + name + "��i = " + i);
		}
	}
}