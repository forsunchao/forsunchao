package test.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class TestObjectInputStream {

	public static void main(String[] args) {
		try {
			// 创建文件输入流
			FileInputStream fis = new FileInputStream("D:/demo/test.tmp");
			// 创建对象输入流
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 读取对象数据
			int i = ois.readInt();
			String str = (String) ois.readObject();
			Date date = (Date) ois.readObject();
			System.out.println("i=" + i);
			System.out.println("str=" + str);
			System.out.println("date" + date);
			
			// 关闭输入流
			ois.close();
			fis.close();
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		}
	}
}
