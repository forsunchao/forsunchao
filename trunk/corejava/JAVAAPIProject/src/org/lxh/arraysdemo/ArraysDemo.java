package org.lxh.arraysdemo;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int i1[] = { 1, 2, 3, 4, 5, 6 }; // ������������һ��
		int i2[] = { 6, 5, 4, 3, 2, 1 }; // ������������һ��
		Arrays.sort(i2);
		System.out.println(Arrays.equals(i1, i2));
		Arrays.fill(i2, 3); // ������2������ȫ�����Ϊ3
		System.out.println(Arrays.toString(i2));// �������
	}

}
