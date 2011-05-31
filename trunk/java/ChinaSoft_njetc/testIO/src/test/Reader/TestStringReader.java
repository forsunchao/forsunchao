package test.Reader;

import java.io.IOException;
import java.io.StringReader;

public class TestStringReader {

	public static void main(String[] args) {
		try {
			// 创建输入流
			StringReader is = new StringReader("Hello,World!");
			
			// 从输入流读取数据
			int c;
			while ( (c = is.read()) > 0) {
				System.out.print((char)c);
			}
			
			// 关闭输入流
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
