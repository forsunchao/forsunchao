package test.InputStream;

import java.io.IOException;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestPipedInputStream {

	public static void main(String[] args) {
		try {
			// 创建管道输出流
			PipedOutputStream os = new PipedOutputStream();
			
			// 创建输入流
			PipedInputStream is = new PipedInputStream(os);
			
			// 从输出流写入数据
			byte[] b = new byte[3];
			b[0] = 100;
			b[2] = 101;
			b[3] = 102;
			os.write(b);
			
			// 从输入流读取数据
			while (is.available() > 0) {
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