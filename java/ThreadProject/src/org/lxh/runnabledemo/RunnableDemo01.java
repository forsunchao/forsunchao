package org.lxh.runnabledemo;

public class RunnableDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("线程A");
		MyThread mt2 = new MyThread("线程B");
		new Thread(mt1).start(); // 调用线程体
		new Thread(mt2).start(); // 调用线程体
	}
}
