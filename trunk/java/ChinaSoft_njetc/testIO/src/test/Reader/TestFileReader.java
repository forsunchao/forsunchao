package test.Reader;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) {
		try {
			// 创建输入流
			FileReader is = new FileReader("D:/demo/test.txt");
			
			// 从输入流读取数据
			while (is.ready()) {
				int c = is.read();
				System.out.print((char)c);
			}
			
			// 关闭输入流
			is.close();
		} catch (IOException e) {
		}
	}
}
