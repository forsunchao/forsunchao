package test.Runtime;

public class TestRuntimeHook {
	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				// 关闭线程
				System.out.println("系统正在退出……");
			}
		});
		
		while (true) {
			String line =  System.console().readLine();
			System.out.println(line);
			if (line.equals("bye")) {
				System.exit(0);
			}
		}
	}
}
