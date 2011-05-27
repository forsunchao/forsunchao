package org.lxh.outputstreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt"); // 要操作的文件
		OutputStream out = null; // 声明字节输出流
		out = new FileOutputStream(file); // 通过子类实例化
		String str = "hello world"; // 要输出的信息
		byte b[] = str.getBytes(); // 将String变为byte数组
		out.write(b); // 写入数据
	}

}
