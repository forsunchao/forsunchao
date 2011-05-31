package org.lxh.runtimedemo;

public class RuntimeDemo02 {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime(); // 单例设计
		Process pro = run.exec("freecell.exe");// 执行程序
		Thread.sleep(2000); // 看2秒
		pro.destroy(); // 销毁
	}

}
