package test.Reader;

import java.io.IOException;

import java.io.PipedReader;
import java.io.PipedWriter;

public class TestPipedReader {

	public static void main(String[] args) {
		try {
			// 创建管道输出流
			PipedWriter os = new PipedWriter();
			
			// 创建输入流
			PipedReader is = new PipedReader(os);
			
			// 从输出流写入数据
			char[] buf = new char[3];
			buf[0] = 'a';
			buf[1] = 'b';
			buf[2] = 'c';
			os.write(buf);
			
			// 从输入流读取数据
			while (is.ready()) {
				int c = is.read();
				System.out.print((char)c);
			}
			
			// 关闭输入流
			is.close();
			
			// 关闭输出流
			os.close();
		} catch (IOException e) {
		}
	}
}