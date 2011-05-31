package org.lxh.serdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws Exception {
		File file = new File("d:" + File.separator + "person.ser");
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream(file));
		Object obj = ois.readObject();
		Person per = (Person) obj;
		System.out.println(per);
	}

}
