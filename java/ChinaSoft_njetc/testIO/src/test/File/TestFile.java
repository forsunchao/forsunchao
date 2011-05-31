package test.File;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("D:/demo"); // 目录实例
		ExtensionFilter txtFilter = new ExtensionFilter("txt"); // 创建一个txt过滤器
		File[] files = file.listFiles(txtFilter); // 使用过滤器查找txt文件
		// 输出查找的文件列表
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getAbsolutePath());
		}
		
		
		ImageFilter imageFilter = new ImageFilter();// 创建一个图片过滤器
		File[] images = file.listFiles(imageFilter);// 使用过滤器查找图片文件
		// 输出查找的文件列表
		for (int i = 0; i < images.length; i++){
			System.out.println(images[i].getAbsolutePath());
		}
	}
}
