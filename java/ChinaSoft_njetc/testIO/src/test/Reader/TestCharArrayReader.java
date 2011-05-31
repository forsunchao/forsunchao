package test.Reader;

import java.io.CharArrayReader;
import java.io.IOException;

public class TestCharArrayReader {

	public static void main(String[] args) {
		// 初始化字符数组
		char[] buf = new char[3];
		buf[0] = 'a';
		buf[1] = 'b';
		buf[2] = 'c';
		try {
			// 创建输入流
			CharArrayReader is = new CharArrayReader(buf);
			
			// 从输入流读取数据
			char[] b = new char[3];
			is.read(b);
			System.out.println(new String(b));
			
			// 关闭输入流
			is.close();
		} catch (IOException e) {
		}
	}
}
