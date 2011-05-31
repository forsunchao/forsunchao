package test.OutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {

	public static void main(String[] args) {
		try {
			// 创建文件输出流
			FileOutputStream fos = new FileOutputStream("D:/demo/data.tmp");
			// 创建对象输出流
			DataOutputStream oos = new DataOutputStream(fos);

			// 写入对象数据
			oos.writeInt(12345);
			oos.writeBoolean(true);
			oos.writeFloat(1000.0f);

			// 关闭输出流
			oos.close();
			fos.close();
		} catch (IOException e) {
		}
	}
}
