package org.lxh.filedemo;

import java.io.File;

public class ListFilesDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "docs"); // 找到File类的实例
		File path[] = file.listFiles(); // 列出全部的子文件或文件夹
		for (int i = 0; i < path.length; i++) {
			System.out.print(path[i].getParent() + " --> ");
			System.out.println(path[i].getPath());
		}
	}

}
