
public class Test01 {
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static float plus(float a, float b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println(Test01.plus(5, 7));
		System.out.println(Test01.plus(5f, 7f));
		System.out.println(Test01.plus(5.0, 7.0));
	}
	
	public void fly() {
		System.out.println("¸¸Àà");
	}
}
