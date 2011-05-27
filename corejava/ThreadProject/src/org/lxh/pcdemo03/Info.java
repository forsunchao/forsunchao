package org.lxh.pcdemo03;

public class Info {
	private String title = "���˻�";
	// private String title = "MLDN";
	private String content = "Java��ʦ";
	// private String content = "www.mldnjava.cn";
	private boolean flag = false; // Ĭ����false

	/*
	 * 1��flag = true����ʾ�������������ǲ���ȡ��
	 * 
	 * 2��flag = false����ʾ����ȡ�ߣ����ǲ�������
	 */
	public synchronized void set(String title, String content) {
		if (flag == false) {// �Ѿ��������ˣ���Ҫ�ȴ�
			try {
				super.wait(); // �ȴ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.setTitle(title);
		try {
			Thread.sleep(300); // ����0.3��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
		this.flag = false;// ��ʾ����������
		super.notify(); // ���������ȴ����߳�
	}

	public synchronized void get() {
		if (flag == true) {// ��ʾ����ȡ
			try {
				super.wait(); // �ȴ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.title + " --> " + this.content);
		this.flag = true;// ��ʾ����ȡ����
		super.notify(); // ����
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
