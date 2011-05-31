package org.lxh.filedemo;

import java.io.File;

public class ListDirectoryDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator);
		list(file);
	}

	public static void list(File file) {
		if (file.isDirectory()) {
			File[] path = file.listFiles();
			if (path != null) {
				for (int i = 0; i < path.length; i++) {
					list(path[i]);// ÁÐ³öÄÚÈÝ
				}
			}
		}
		System.out.println(file);
	}
}
