package test.System;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestSystemExit {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line;
			while ((line = br.readLine()) != null) {// 读取数据
				System.out.println(line);// 执行操作
				if (line.equals("bye")) {// 退出系统
					System.exit(0);
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
