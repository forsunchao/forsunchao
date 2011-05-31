package test.System;

public class TestSystemArrayCopy {
	public static void main(String args[]) {
		// 定义源数组
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i+1;
		}
		
		// 拷贝目标数组
		int[] b = new int[5];
		System.arraycopy(a, 2, b, 1, 4);
		
		// 输出目标数组
		for (int i = 0; i < 5; i++) {
			System.out.println("b" + i + "=" + b[i]);
		}
	}
}
