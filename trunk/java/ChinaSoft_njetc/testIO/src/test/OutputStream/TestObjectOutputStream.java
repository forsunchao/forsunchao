package test.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream {

	public static void main(String[] args) {
		try {
			// 创建文件输出流
			FileOutputStream fos = new FileOutputStream("D:/demo/test.tmp");
			// 创建对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(fos);
	        
	        // 写入对象数据
	        oos.writeInt(12345);
	        oos.writeObject("Hello,World");
	        oos.writeObject(new Date());

			// 关闭输出流
	        oos.close();
		} catch (IOException e) {
		}
	}
}
