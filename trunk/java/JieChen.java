/*
 * ตÝน้
 */
public class JieChen {
	public static void main(String[] args) {
		System.out.println(calc(4));
	}

	public static long calc(long i) {
		if (i == 0) {
			return 1;
		} else {
			return i * calc(i - 1);
		}
	}
}
