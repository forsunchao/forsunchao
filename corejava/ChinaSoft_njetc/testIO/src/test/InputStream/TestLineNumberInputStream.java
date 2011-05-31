package test.InputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;

public class TestLineNumberInputStream {

	public static void main(String[] args) {
		try {
			// 创建文件输入流
			FileInputStream fis = new FileInputStream("D:/demo/test.txt");
			// 创建行号输入流
            LineNumberInputStream lis = new LineNumberInputStream(fis);
            // 创建数据输入流
            DataInputStream dis = new DataInputStream(lis);

			
			// 读取数据
			String line;
			while ((line = dis.readLine()) != null) {
				System.out.println(lis.getLineNumber() + ":" + line);
			}
			
			// 关闭输入流
			dis.close();
			lis.close();
			fis.close();
		} catch (IOException e) {
		}
	}
}
