package test.Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {

	public static void main(String[] args) {
		try {
			// 创建输入流
			FileReader is = new FileReader("D:/demo/test.txt");
			BufferedReader bis = new BufferedReader(is);
			
			// 从输入流读取数据
			while (bis.ready()) {
				int c = bis.read();
				System.out.print((char)c);
			}
			
			// 关闭输入流
			bis.close();
			is.close();
		} catch (IOException e) {
		}
	}
}
