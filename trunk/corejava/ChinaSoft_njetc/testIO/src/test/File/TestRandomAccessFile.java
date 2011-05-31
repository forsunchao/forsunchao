package test.File;

import java.io.RandomAccessFile;

public class TestRandomAccessFile {
	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("D:/demo/test.txt", "rw");
			
			// 定位读取位置
			file.seek(1);
			
			// 读取文件长度
			long size = file.length();
			System.out.println("文件大小："+size);
			
			// 读取一个字节
			int c = file.read();
			System.out.println((char)c);
			
			// 读取字节数组
			byte[] b = new byte[3];
			file.read(b);
			String str = new String(b);
			System.out.println(str);
			
			// 读取字节数组
			byte[] b2 = new byte[3];
			file.read(b2, 1, 2);
			String str2 = new String(b2);
			System.out.println(str2);
			
			// 读取一行数据
			System.out.println(file.readLine());
			
			// 写入一个字节
			file.write(100);
			
			// 写入字节数组
			byte[] bw = new byte[3];
			bw[0] = 100;
			bw[1] = 101;
			bw[2] = 102;
			file.write(bw);
			
			// 写入字节数组
			file.write(bw, 1, 2);
			
			// 写入字符串
			file.writeBytes("AA");
			file.writeChars("DD");
			
			// 写入中文字符
			file.writeUTF("中国");
			
			// 关闭文件
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
