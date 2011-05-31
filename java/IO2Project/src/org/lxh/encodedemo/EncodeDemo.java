package org.lxh.encodedemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		OutputStream output = new FileOutputStream(new File("d:"
				+ File.separator + "test.txt"));
		String str = "ÖÐ¹ú£¬ÄãºÃ£¡";
		output.write(str.getBytes("ISO8859-1"));
		output.close() ;
	}

}
