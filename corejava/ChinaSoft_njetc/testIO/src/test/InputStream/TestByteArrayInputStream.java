package test.InputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TestByteArrayInputStream {

	public static void main(String[] args) {
		// 初始化字节数组
		byte[] buf = new byte[3];
		buf[0] = 100;
		buf[1] = 101;
		buf[2] = 102;
		try {
			// 创建输入流
			ByteArrayInputStream is = new ByteArrayInputStream(buf);
			
			// 从输入流读取数据
			byte[] b = new byte[3];
			is.read(b);
			System.out.println(new String(b));
			
			// 关闭输入流
			is.close();
		} catch (IOException e) {
		}
	}
}
