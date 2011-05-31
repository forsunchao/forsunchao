package test.Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class TestPushbackReader {

	public static void main(String[] args) {
		try {
			// 创建文件输入流
			FileReader fis = new FileReader("D:/demo/test.txt");
			// 创建推回输入流
			PushbackReader pis = new PushbackReader(fis);
			
			// 读取对象数据
			int c = pis.read();
			System.out.print((char)c);
			pis.unread(c);// 推回一个字节
			c = pis.read();// 再次读取
			System.out.print((char)c);
			
			// 关闭输入流
			pis.close();
			fis.close();
		} catch (IOException e) {
		}
	}
}
