package test.System;

public class TestSystemTime {
	public static void main(String args[]) {
		long startMillisTime = System.currentTimeMillis();
		long startNanoTime = System.nanoTime();
		System.out.println("startMillisTime=" + startMillisTime);
		System.out.println("startNanoTime=" + startNanoTime);

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

		long endMillisTime = System.currentTimeMillis();
		long endNanoTime = System.nanoTime();
		System.out.println("endMillisTime=" + endMillisTime);
		System.out.println("endNanoTime=" + endNanoTime);
		
		System.out.println("毫秒：" + (endMillisTime - startMillisTime));
		System.out.println("微秒：" + (endNanoTime - startNanoTime));
	}
}
