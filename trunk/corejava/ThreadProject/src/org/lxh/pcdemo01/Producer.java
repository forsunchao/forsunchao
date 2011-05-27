package org.lxh.pcdemo01;

public class Producer implements Runnable {
	private Info info = null;

	public Producer(Info info) {
		this.info = info;
	}

	public void run() {
		for (int x = 0; x < 100; x++) { // ���ϵ�����
			if (x % 2 == 1) {// ������
				this.info.setTitle("MLDN");
				try {
					Thread.sleep(300); // ����0.3��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.info.setContent("www.mldnjava.cn");
			} else {
				this.info.setTitle("���˻�");
				try {
					Thread.sleep(300); // ����0.3��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.info.setContent("Java��ʦ");
			}
		}
	}
}
