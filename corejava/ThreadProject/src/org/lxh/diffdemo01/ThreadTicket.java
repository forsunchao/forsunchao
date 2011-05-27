package org.lxh.diffdemo01;

public class ThreadTicket {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread(); // 一个线程
		MyThread mt2 = new MyThread(); // 一个线程
		MyThread mt3 = new MyThread(); // 一个线程
		mt1.start() ;	// 开始卖票
		mt2.start() ;	// 开始卖票
		mt3.start() ;	// 开始卖票
	}

}
