package org.lxh.sleepdemo;

public class ThreadSleepDemo {
	public static void main(String args[]){
		MyThread mt = new MyThread() ;
		new Thread(mt,"线程A").start() ;
		new Thread(mt,"线程B").start() ;
	}
}
