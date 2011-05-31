package vi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author liuzhongbing
 * 字符流文本编辑器
 */
public class CharVI {

	public static void main(String[] args) {
		String pathname = "D:/demo"; // 路径名
		try {
			while (true) {
				String str = System.console().readLine();// 取得输入字符串

				if (str.equals("list")) { // 文件列表
					File path = new File(pathname);
					File[] filelist = path.listFiles();
					for (int i = 0; i < filelist.length; i++) {
						File file = filelist[i];
						String filepath = file.getCanonicalPath();
						if (file.isDirectory()) {
							System.out.println("目录：" + filepath);
						} else {
							System.out.println("文件：" + filepath);
						}
					}
				} else if (str.startsWith("cd")) { // 切换目录
					String[] param = str.split(" ");
					pathname = param[1];
				} else if (str.startsWith("mkdir")) {// 创建目录
					String[] param = str.split(" ");
					File path = new File(pathname + "/" + param[1]);
					path.mkdir();
				} else if (str.startsWith("vi")) {// 追加内容
					String[] param = str.split(" ");
					File file = new File(pathname, param[1]);

					// 创建新文件
					if (!file.exists()) {
						file.createNewFile();
					}

					// 创建文件输出流
					FileWriter fos = new FileWriter(file, true);
					BufferedWriter bos = new BufferedWriter(fos);
					PrintWriter pos = new PrintWriter(bos);

					// 写入对象数据
					pos.print(param[2]);

					// 关闭输出流
					bos.close();
					pos.close();
					fos.close();
				} else if (str.startsWith("more")) {// 显示内容
					String[] param = str.split(" ");
					File file = new File(pathname, param[1]);
					
					// 创建输入流
					FileReader is = new FileReader(file);
					BufferedReader bis = new BufferedReader(is);
					
					// 从输入流读取数据
					while (bis.ready()) {
						int c = bis.read();
						System.out.print((char)c);
					}
					
					// 关闭输入流
					bis.close();
					is.close();
				} else if (str.equals("bye")) {// 退出系统
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
