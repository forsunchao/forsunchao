package com.etc.systax;

class Factorial {
	//递归方法
	int fact(int n) {
		int result;
		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		System.out.println("n=" + n + "时返�?" + result);
		return result;
	}

	public static void main(String arg[]) {
		Factorial f = new Factorial();
		System.out.println("Factorial of 4 is " + f.fact(4));
		System.out.println("Factorial of 5 is " + f.fact(5));
	}
}
