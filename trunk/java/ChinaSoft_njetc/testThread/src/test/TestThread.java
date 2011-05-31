package test;

import java.util.Date;

public class TestThread extends Thread {
	public int time;// 休眠时间
	public String user;// 调用用户

	// 构造函数
	public TestThread(int time, String user) {
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
		TestThread thread1 = new TestThread(1000, "Jack");
		TestThread thread2 = new TestThread(3000, "Mike");
		thread1.setPriority(1);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}
}
