package vi;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * @author liuzhongbing
 * 文本编辑器
 */
public class VI {

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

					// 写入内容
					RandomAccessFile afile = new RandomAccessFile(file, "rw");
					afile.seek(afile.length());
					afile.writeUTF(param[2]);
					afile.close();
				} else if (str.startsWith("more")) {// 显示内容
					String[] param = str.split(" ");
					File file = new File(pathname, param[1]);

					// 读取内容
					RandomAccessFile afile = new RandomAccessFile(file, "rw");
					String line;
					while ((line = afile.readLine()) != null) {
						System.out.println(line);
					}
					afile.close();
				} else if (str.equals("bye")) {// 退出系统
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
