package test.OutputStream;

import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class TestPrintStream {

	public static void main(String[] args) {
		try {
			// 创建文件输出流
			FileOutputStream fos = new FileOutputStream("D:/demo/data.tmp");
			// 创建对象输出流
			PrintStream pos = new PrintStream(fos);

			// 写入对象数据
			pos.format("%1$tY年%1$tm月%1$td日 %1$tH时%1$tm分%1$tS秒", new Date());
			pos.println();
			pos.println(12345);
			pos.println(true);
			pos.println(1000.0f);

			// 关闭输出流
			pos.close();
			fos.close();
		} catch (IOException e) {
		}
	}
}
