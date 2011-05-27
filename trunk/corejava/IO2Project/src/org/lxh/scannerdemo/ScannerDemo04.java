package org.lxh.scannerdemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerDemo04 {

	public static void main(String[] args) throws Exception {
		File file = new File("D:" + File.separator + "demo.txt");
		Scanner scan = new Scanner(new FileInputStream(file));
		StringBuffer buf = new StringBuffer();
		scan.useDelimiter("\n") ;
		while (scan.hasNext()) {
			buf.append(scan.next()).append("\n");
		}
		System.out.println("str = " + buf);
	}
}
