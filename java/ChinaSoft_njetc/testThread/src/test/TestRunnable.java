package test;

import java.util.Date;

public class TestRunnable implements Runnable {
	public int time;// 休眠时间
	public String user;// 调用用户

	// 构造函数
	public TestRunnable(int time, String user) {
		this.time = time;
		this.user = user;
	}
	
	// 线程体
	public void run() {
		while (true) {
			try {
				System.out.println(user + "休息" + time + "ms - " + new Date());
				Thread.sleep(time);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	// 启动线程实例
	public static void main(String args[]) {
		TestRunnable thread1 = new TestRunnable(1000, "Jack");
		new Thread(thread1).start();
		TestRunnable thread2 = new TestRunnable(3000, "Mike");
		new Thread(thread2).start();
	}
}
