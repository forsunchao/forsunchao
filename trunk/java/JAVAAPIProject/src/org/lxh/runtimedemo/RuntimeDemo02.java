package org.lxh.runtimedemo;

public class RuntimeDemo02 {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime(); // �������
		Process pro = run.exec("freecell.exe");// ִ�г���
		Thread.sleep(2000); // ��2��
		pro.destroy(); // ����
	}

}
