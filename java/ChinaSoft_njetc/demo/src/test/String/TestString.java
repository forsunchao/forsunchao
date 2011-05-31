package test.String;

public class TestString {
	
	static int count = 100;// 循环次数
	
	// 测试String
	public static void testString() {
		long start = System.nanoTime();
		String str = "";
		for (int i = 0; i < count; i++) {
		    str += "," + i;
		}
		long end = System.nanoTime();
		System.out.println("String：" + (end - start));
	}

	// 测试StringBuffer
	public static void testStringBuffer() {
		long start = System.nanoTime();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < count; i++) {
		    str.append(",").append(i);
		}
		long end = System.nanoTime();
		System.out.println("StringBuffer：" + (end - start));
	}

	// 测试StringBuilder
	public static void testStringBuilder() {
		long start = System.nanoTime();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < count; i++) {
		    str.append(",").append(i);
		}
		long end = System.nanoTime();
		System.out.println("StringBuilder：" + (end - start));
	}

	public static void main(String[] args) {
		//TestString.testString();
		TestString.testStringBuffer();
		TestString.testStringBuilder();
	}
}
