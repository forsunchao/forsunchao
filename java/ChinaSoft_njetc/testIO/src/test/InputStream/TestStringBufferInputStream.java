package test.InputStream;

import java.io.IOException;
import java.io.StringBufferInputStream;

public class TestStringBufferInputStream {

	public static void main(String[] args) {
		try {
			// 创建输入流
			StringBufferInputStream is = new StringBufferInputStream("Hello,World!");
			
			// 从输入流读取数据
			while (is.available() > 0) {
				int c = is.read();
				System.out.print((char)c);
			}
			
			// 关闭输入流
			is.close();
		} catch (IOException e) {
		}
	}
}
