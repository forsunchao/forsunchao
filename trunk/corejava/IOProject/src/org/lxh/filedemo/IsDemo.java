package org.lxh.filedemo;

import java.io.File;

public class IsDemo {
	public static void main(String[] args) {
		File file1 = new File("d:" + File.separator + "demo.txt");
		File file2 = new File("d:" + File.separator + "docs");
		System.out.println(file1.isFile());// 判断是否是文件
		System.out.println(file2.isDirectory());// 判断是否是目录
	}

}
