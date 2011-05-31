package test.System;

/**
 * @author liuzhongbing
 * 测试读取字符串
 */
public class TestSystemInReadString {
	public static void main(String args[]) {
		try {
			byte[] b = new byte[100]; //创建字节数组
			System.in.read(b); //读取到数组中
			String str = new String(b); //转换为字符串
			System.out.println(str); //输出字符串
		} catch (Exception e) {
		}
	}
}
