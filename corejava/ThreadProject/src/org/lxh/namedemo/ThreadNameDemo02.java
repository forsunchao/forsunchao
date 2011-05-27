package org.lxh.namedemo;

public class ThreadNameDemo02 {
	public static void main(String[] args) {
		MyThread mt = new MyThread(); // Runnable子类实例
		new Thread(mt, "自定义线程").start();
		mt.run() ;	// 直接通过对象调用
	}

}
