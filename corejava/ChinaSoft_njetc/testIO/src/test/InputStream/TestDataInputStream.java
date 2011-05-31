package test.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.DataInputStream;

public class TestDataInputStream {

	public static void main(String[] args) {
		try {
			// 创建文件输入流
			FileInputStream fis = new FileInputStream("D:/demo/data.tmp");
			// 创建数据输入流
			DataInputStream dis = new DataInputStream(fis);
			
			// 读取对象数据
			int i = dis.readInt();
			boolean b = dis.readBoolean();
			float f = dis.readFloat();
			System.out.println("i=" + i);
			System.out.println("b=" + b);
			System.out.println("f=" + f);
			
			// 关闭输入流
			dis.close();
			fis.close();
		} catch (IOException e) {
		}
	}
}
