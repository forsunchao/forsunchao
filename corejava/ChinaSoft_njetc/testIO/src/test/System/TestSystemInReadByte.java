package test.System;

/**
 * @author liuzhongbing
 * 测试函数：System.in.read(b)
 */
public class TestSystemInReadByte {
	public static void main(String args[]) {
		try {
			byte[] b = new byte[100]; //创建字节数组
			System.in.read(b); //读取到数组中
			System.out.write(b, 0, 100); //输出字节数组
		} catch (Exception e) {
		}
	}
}
