package org.lxh.serdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "person.ser");
		ObjectOutputStream oos = null;
		oos = new ObjectOutputStream(new FileOutputStream(file));
		Person per = new Person("уехЩ", 30);
		oos.writeObject(per) ;
		oos.close() ;
	}

}
