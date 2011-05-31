package test.Console;

/**
 * @author liuzhongbing
 * 测试函数System.console().readLine()
 */
public class TestConsole {
	public static void main(String args[]) {
		while (true) {
			String str = System.console().readLine();// 取得输入字符串
			System.out.println(str); //输出字符串
		}
	}
}
