package test.System;

/**
 * @author liuzhongbing
 * 测试函数：System.in.read()
 */
public class TestSystemInRead {
	public static void main(String args[]) {
		try {
			int c;
			while ((c = System.in.read()) != 0) { //读入一个字节
				System.out.write(c); //输出一个字节
			}
		} catch (Exception e) {
		}
	}
}
