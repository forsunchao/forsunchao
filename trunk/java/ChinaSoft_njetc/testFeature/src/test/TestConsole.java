package test;

import java.io.File;
import java.util.Scanner;

public class TestConsole {

	public static void main(String[] args) throws Exception {
		// 读取控制台输入
		//Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();
		//sc.close();
		
		// 读取文件
		Scanner sc2 = new Scanner(new File("D:/demo/test.txt"));
		while (sc2.hasNextLong()) {
			long aLong = sc2.nextLong();
			System.out.println(aLong);
		}
		sc2.close();
		
		// 读取字符串
		String input = "1 fish 2 fish red fish blue fish";
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();


	}
}
