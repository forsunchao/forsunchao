package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class TestFile {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("由父进程输入的信息：" + br.readLine());
			
			File f = new File("D:/demo/testfile.txt");
			f.createNewFile();
			System.out.println("被调用成功!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
