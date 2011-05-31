package test.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) {
		try {
			// 创建输入流
			FileInputStream is = new FileInputStream("D:/demo/test.txt");
			
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
