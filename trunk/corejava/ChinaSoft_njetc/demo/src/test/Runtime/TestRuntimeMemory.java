package test.Runtime;

public class TestRuntimeMemory {
	public static void main(String[] args) {
		System.out.println("内存总量：" + Runtime.getRuntime().totalMemory());
		System.out.println("最大内存量：" + Runtime.getRuntime().maxMemory());
		System.out.println("空闲内存量：" + Runtime.getRuntime().freeMemory());
	}
}
