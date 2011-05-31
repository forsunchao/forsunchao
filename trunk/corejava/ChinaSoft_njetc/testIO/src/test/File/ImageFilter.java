package test.File;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author liuzhongbing
 * 图片过滤器
 */
public class ImageFilter implements FilenameFilter {

	/**
	 * gif文件
	 * @param filename 文件名
	 * @return
	 */
	public boolean isGif(String filename) {
		if (filename.toLowerCase().endsWith(".gif")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * jpg文件
	 * @param filename 文件名
	 * @return
	 */
	public boolean isJpg(String filename) {
		if (filename.toLowerCase().endsWith(".jpg")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * png文件
	 * @param filename 文件名
	 * @return
	 */
	public boolean isPng(String filename) {
		if (filename.toLowerCase().endsWith(".png")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean accept(File dir, String filename) {
		return (isGif(filename) || isJpg(filename) || isPng(filename));
	}
}
