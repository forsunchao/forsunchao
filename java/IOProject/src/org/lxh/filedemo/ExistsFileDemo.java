package org.lxh.filedemo;

import java.io.File;

public class ExistsFileDemo {

	public static void main(String[] args) {
		File file = new File("d:" + File.separator + "demo.txt"); // 找到File类的实例
		if (file.exists()) {// 判断文件是否存在
			System.out.println("文件存在。");
		}else{
			System.out.println("文件不存在。") ;
		}
	}

}
