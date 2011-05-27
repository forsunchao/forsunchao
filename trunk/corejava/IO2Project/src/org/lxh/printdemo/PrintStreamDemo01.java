package org.lxh.printdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo01 {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt");
		PrintStream out = new PrintStream(new FileOutputStream(file));
		out.print("hello");
		out.println("world");
		out.println(19);
		out.print(20.3);
		out.close() ;
	}

}
