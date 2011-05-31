package org.lxh.filedemo;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo01 {

	public static void main(String[] args) {
		File file = new File("d:\\demo.txt"); // 找到File类的实例
		try {
			file.createNewFile(); // 创建文件
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
