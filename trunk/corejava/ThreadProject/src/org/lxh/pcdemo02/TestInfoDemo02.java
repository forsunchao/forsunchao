package org.lxh.pcdemo02;

public class TestInfoDemo02 {
	public static void main(String[] args) {
		Info info = new Info();
		Producer pro = new Producer(info); // ʵ���������߶���
		Consumer con = new Consumer(info); // ʵ���������߶���
		new Thread(pro).start(); // �����߳�
		new Thread(con).start(); // �����߳�
	}

}
