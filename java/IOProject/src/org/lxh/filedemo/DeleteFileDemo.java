package org.lxh.filedemo;

import java.io.File;

public class DeleteFileDemo {

	public static void main(String[] args) {
		File file = new File("d:\\demo.txt"); // 找到File类的实例
		file.delete() ;// 删除文件
	}

}
