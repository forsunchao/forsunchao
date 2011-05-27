package org.lxh.pcdemo01;

public class Consumer implements Runnable {
	private Info info = null;

	public Consumer(Info info) {
		this.info = info;
	}

	public void run() {
		for (int x = 0; x < 100; x++) {
			try {
				Thread.sleep(300); // ÐÝÃß0.3Ãë
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.info.getTitle() + " -> "
					+ this.info.getContent()); // È¡ÄÚÈÝ
		}
	}

}
