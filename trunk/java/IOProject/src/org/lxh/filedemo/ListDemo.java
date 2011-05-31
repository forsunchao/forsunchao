package org.lxh.filedemo;

import java.io.File;

public class ListDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "docs"); // 找到File类的实例
		String path[] = file.list(); // 列出全部的内容
		for (int i = 0; i < path.length; i++) {
			System.out.println(path[i]) ;
		}
	}

}
