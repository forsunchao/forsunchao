package test.Console;

/**
 * @author liuzhongbing
 * 测试读取密码
 */
public class TestConsolePassword {
	public static void main(String args[]) {
		while (true) {
            char password[] = System.console().readPassword();// 取得密码
            System.out.println(password); //输出字符串
        }
	}
}
