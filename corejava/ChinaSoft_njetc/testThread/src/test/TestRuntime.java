package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestRuntime {
	public static void main(String[] args) {
		try {
			Runtime run = Runtime.getRuntime();
			Process p = run.exec("java test.TestFile");
			
			// 向子进程输入
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
			bw.write("Hello,World!");
			bw.flush();
			bw.close(); // 必须得关闭流，否则无法向子进程中输入信息	
			
			// 获得子进程的输出信息
			BufferedInputStream in = new BufferedInputStream(p.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println("子进程输出：" + s);
			}
			br.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
