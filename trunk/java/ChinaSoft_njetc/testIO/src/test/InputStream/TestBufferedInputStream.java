package test.InputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		try {
			// 创建输入流
			FileInputStream is = new FileInputStream("D:/demo/test.txt");
			BufferedInputStream bis = new BufferedInputStream(is);
			
			// 从输入流读取数据
			while (bis.available() > 0) {
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
