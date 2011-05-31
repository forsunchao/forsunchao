package org.lxh.threaddemo;

public class ThreadDemo01 {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("线程A") ;
		MyThread mt2 = new MyThread("线程B") ;
		mt1.run() ;	// 调用线程体
		mt2.run() ;	// 调用线程体
	}
}
