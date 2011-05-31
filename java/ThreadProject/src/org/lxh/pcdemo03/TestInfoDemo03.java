package org.lxh.pcdemo03;

public class TestInfoDemo03 {
	public static void main(String[] args) {
		Info info = new Info();
		Producer pro = new Producer(info); // 实例化生产者对象
		Consumer con = new Consumer(info); // 实例化消费者对象
		new Thread(pro).start(); // 启动线程
		new Thread(con).start(); // 启动线程
	}

}
