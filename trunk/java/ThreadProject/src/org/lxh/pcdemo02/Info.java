package org.lxh.pcdemo02;

public class Info {
	private String title = "���˻�";
	// private String title = "MLDN";
	private String content = "Java��ʦ";

	// private String content = "www.mldnjava.cn";
	public synchronized void set(String title, String content) {
		this.setTitle(title);
		try {
			Thread.sleep(300); // ����0.3��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
	}

	public synchronized void get() {
		System.out.println(this.title + " --> " + this.content);
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
