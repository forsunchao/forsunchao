package org.lxh.diffdemo02;

public class RunnableTicket {
	public static void main(String[] args) {
		MyThread mt = new MyThread(); // 一个线程
		new Thread(mt).start() ;	// 开始卖票
		new Thread(mt).start() ;	// 开始卖票
		new Thread(mt).start() ;	// 开始卖票
	}

}
