package org.lxh.pcdemo02;

public class Producer implements Runnable {
	private Info info = null;

	public Producer(Info info) {
		this.info = info;
	}

	public void run() {
		for (int x = 0; x < 100; x++) { // ���ϵ�����
			if (x % 2 == 1) {// ������
				this.info.set("MLDN", "www.mldnjava.cn");
			} else {
				this.info.set("���˻�", "Java��ʦ");
			}
		}
	}
}
