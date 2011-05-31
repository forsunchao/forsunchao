package org.lxh.filedemo;

import java.io.File;
import java.io.IOException;

public class MkDirDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo" + File.separator
				+ "test.txt"); // 找到File类的实例
		file.getParentFile().mkdir();// 创建d:\demo文件夹
		try {
			file.createNewFile(); // 创建文件
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
