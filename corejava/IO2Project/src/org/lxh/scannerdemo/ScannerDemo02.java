package org.lxh.scannerdemo;

import java.util.Scanner;

public class ScannerDemo02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null ;
		if (scan.hasNext()) {
			str = scan.next();
		}
		System.out.println("str = " + str);
	}
}
