package org.lxh.runtimedemo;

public class RuntimeDemo03 {
	public static void main(String[] args) throws Exception {
		Runtime run = Runtime.getRuntime(); // �������
		System.out.println("** ���Ŀ����ڴ棺" + run.maxMemory());
		System.out.println("** �ܹ��ڴ�ռ䣺" + run.totalMemory());
		System.out.println("����ǰ�Ŀ��е��ڴ�ռ䣺" + run.freeMemory());
		String str = "";
		for (int i = 0; i < 10000; i++) {
			str += i; // ���������������
		}
		System.out.println("�����Ŀ��е��ڴ�ռ䣺" + run.freeMemory());
		run.gc(); // ���������ռ�
		System.out.println("�����ռ�֮��Ŀ��е��ڴ�ռ䣺" + run.freeMemory());
	}
}
