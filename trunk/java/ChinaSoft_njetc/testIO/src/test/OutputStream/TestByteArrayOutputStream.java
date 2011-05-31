package test.OutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestByteArrayOutputStream {

	public static void main(String[] args) {
		try {
			// 创建输出流
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			
			// 写入数组数据
			byte[] buf = new byte[3];
			buf[0] = 100;
			buf[1] = 101;
			buf[2] = 102;
			os.write(buf);
			
			// 从输出流读取数据
			System.out.println(os.toString());
			
			// 关闭输出流
			os.close();
		} catch (IOException e) {
		}
	}
}
