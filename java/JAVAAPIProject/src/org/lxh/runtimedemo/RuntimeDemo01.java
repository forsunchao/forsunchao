package org.lxh.runtimedemo;

public class RuntimeDemo01 {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime(); // �������
		run.exec("freecell.exe");// ִ�г���
	}

}
