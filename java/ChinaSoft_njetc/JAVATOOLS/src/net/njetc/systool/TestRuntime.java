package net.njetc.systool;

import java.io.IOException;

public class TestRuntime {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 通过 getRuntime 方法获取当前运行时
		Runtime rt = Runtime.getRuntime();
		try {
			// 在单独的进程中执行指定的字符串命令
			// calc表示调用计算器命令，类似的还有notepad(记事本),mspaint(画图)等等。
			rt.exec("calc");
			rt.exec("notepad");
			rt.exec("mspaint");
			// 启动Tomcat
			rt.exec("cmd /c C:\\Program Files\\Apache Software Foundation\\Tomcat 6.0\\bin\\tomcat6.exe");
			// 停止MySQL服务
			rt.exec("cmd /c net stop MySQL");
			

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
