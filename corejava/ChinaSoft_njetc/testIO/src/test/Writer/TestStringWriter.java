package test.Writer;

import java.io.IOException;
import java.io.StringWriter;

public class TestStringWriter {

	public static void main(String[] args) {
		try {
			// 创建输出流
			StringWriter os = new StringWriter();
			
			// 写入数据
			os.write("Hello,World!");
			
			// 从输出流读取数据
			System.out.println(os.toString());
			
			// 关闭输出流
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
