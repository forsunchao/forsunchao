package org.lxh.sytemiodemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirectSystemOutDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "demo.txt");
		System.setOut(new PrintStream(new FileOutputStream(file)));
		System.out.println("hello world") ;
	}

}
