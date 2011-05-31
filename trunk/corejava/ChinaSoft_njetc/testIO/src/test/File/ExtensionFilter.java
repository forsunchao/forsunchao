package test.File;

import java.io.File;
import java.io.FileFilter;

/**
 * @author liuzhongbing
 * 括展名过滤器
 */
public class ExtensionFilter implements FileFilter {

	// 扩展名
	private String extension;

	public ExtensionFilter(String extension) {
		this.extension = extension;
	}

	public boolean accept(File file) {
		// 如果是目录则返回false
		if (file.isDirectory()) {
			return false;
		}

		// 取得文件名
		String name = file.getName();
		// 扩展名前的符号“.”
		int index = name.lastIndexOf(".");
		if (index == -1) { // 没有扩展名则返回false
			return false;
		} else if (index == name.length() - 1) { // 以点号结尾则返回false
			return false;
		} else { // 如果括展名相同，则返回true
			return this.extension.equals(name.substring(index + 1));
		}
	}
}