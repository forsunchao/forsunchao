package test;

public class TestThreadGroup {
	public static void main(String args[]) {
		ThreadGroup group1=new ThreadGroup("group1");
		ThreadGroup group2=new ThreadGroup(group1,"group2");
		Thread t1 = new Thread(group1, new TestThread(1000, "AAA"));
		Thread t2 = new Thread(group2, new TestThread(1000, "BBB"));
		Thread t3 = new Thread(group2, new TestThread(1000, "CCC"));
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(group1.activeCount());
		System.out.println(group2.activeCount());
		System.out.println(group1.activeGroupCount());		
	}
}
