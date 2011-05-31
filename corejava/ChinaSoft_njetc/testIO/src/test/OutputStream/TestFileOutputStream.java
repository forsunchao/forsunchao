package test.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) {
		try {
			// 创建输出流
			FileOutputStream os = new FileOutputStream("D:/demo/test.txt");
			
			// 写入数组数据
			byte[] buf = new byte[3];
			buf[0] = 100;
			buf[1] = 101;
			buf[2] = 102;
			os.write(buf);
			
			// 关闭输出流
			os.close();
		} catch (IOException e) {
		}
	}
}
