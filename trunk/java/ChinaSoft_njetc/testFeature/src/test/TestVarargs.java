package test;

public class TestVarargs {

	public static int add(int... args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total;
	}

	public static void main(String[] args) {
		int a;
		a = TestVarargs.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(a);
	}
}
