package test.Writer;

import java.io.CharArrayWriter;
import java.io.IOException;

public class TestCharArrayWriter {

	public static void main(String[] args) {
		try {
			// 创建输出流
			CharArrayWriter os = new CharArrayWriter();
			
			// 写入数组数据
			char[] buf = new char[3];
			buf[0] = 'a';
			buf[1] = 'b';
			buf[2] = 'c';
			os.write(buf);
			
			// 从输出流读取数据
			System.out.println(os.toString());
			
			// 关闭输出流
			os.close();
		} catch (IOException e) {
		}
	}
}
