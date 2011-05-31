package org.lxh.persondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOperate {
	private File file = null;

	public FileOperate(String path) {
		this.file = new File(path); // 从外部指定操作的文件路径
	}

	public void save(Object obj) throws Exception {
		ObjectOutputStream oos = null;
		oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(obj);
		oos.close();
	}

	public Object load() throws Exception {
		Object temp = null;
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream(file));
		temp = ois.readObject();
		return temp;
	}
}
