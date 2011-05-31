package test.Writer;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) {
		try {
			// 创建输出流
			FileWriter os = new FileWriter("D:/demo/test.txt");
			
			// 写入数组数据
			char[] buf = new char[3];
			buf[0] = 'a';
			buf[1] = 'b';
			buf[2] = '中';
			os.write(buf);
			
			// 关闭输出流
			os.close();
		} catch (IOException e) {
		}
	}
}
