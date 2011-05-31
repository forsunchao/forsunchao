package test;

public class Test extends Thread {
	static int count = 1;//次数
	public void run() {
		for (int k = 0; k < 5; k++) {
			count = count + 1;
		}
	}

	public static void main(String[] args)throws Exception {
		Test t1 = new Test();
		t1.start();
		t1.join();
		System.out.println(Test.count);
	}
}
