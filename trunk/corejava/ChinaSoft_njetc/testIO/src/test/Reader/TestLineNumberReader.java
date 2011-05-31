package test.Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class TestLineNumberReader {

	public static void main(String[] args) {
		try {
			// 创建文件输入流
			FileReader fis = new FileReader("D:/demo/test.txt");
			// 创建行号输入流
			LineNumberReader lis = new LineNumberReader(fis);
			
			// 读取数据
			String line;
			while ((line = lis.readLine()) != null) {
				System.out.println(lis.getLineNumber() + ":" + line);
			}
			
			// 关闭输入流
			lis.close();
			fis.close();
		} catch (IOException e) {
		}
	}
}
