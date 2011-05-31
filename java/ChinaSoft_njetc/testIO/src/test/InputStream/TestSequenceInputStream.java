package test.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class TestSequenceInputStream {
	
	public static void main(String[] args) {
		try {
			// 创建输入源数组
			FileInputStream fis1 = new FileInputStream("D:/demo/test.txt");
			FileInputStream fis2 = new FileInputStream("D:/demo/test2.txt");
			Vector<FileInputStream> vector = new Vector<FileInputStream>();
			vector.add(fis1);
			vector.add(fis2);
			Enumeration<FileInputStream> e = vector.elements();
			
			// 创建序列输入源
			SequenceInputStream is = new SequenceInputStream(e);
			
		    // 从输入流读取数据
			while (is.available() > 0) {
				int c = is.read();
				System.out.print((char)c);
			}
			
			// 关闭输入流
			is.close();
		} catch (IOException e) {
		}
	}
}