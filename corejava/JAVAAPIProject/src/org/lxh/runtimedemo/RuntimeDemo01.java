package org.lxh.runtimedemo;

public class RuntimeDemo01 {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime(); // 单例设计
		run.exec("freecell.exe");// 执行程序
	}

}
