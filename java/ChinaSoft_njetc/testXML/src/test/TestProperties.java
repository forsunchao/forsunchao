package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			FileInputStream fis = new FileInputStream("src/config.properties");
			
			// 读取文件
			properties.load(fis);
			
			// 取得键列表
			Iterator<?> keys = properties.keySet().iterator();
			while (keys.hasNext()) {
				String key = (String)keys.next();// 键
				String value = properties.getProperty(key);// 值
				System.out.println(key + "=" + value);
			}
			fis.close();
			
			// 写入文件
			FileOutputStream fos = new FileOutputStream("D:/demo/config.properties");
			properties.store(fos, "my testproperties");
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
