package org.lxh.namedemo;

public class MyThread implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "线程正在运行。");
		}
	}

}
