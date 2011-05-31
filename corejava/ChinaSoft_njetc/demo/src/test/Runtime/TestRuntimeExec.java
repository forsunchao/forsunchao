package test.Runtime;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestRuntimeExec {
	public static void main(String[] args) {
		try {
			// 打开记事本
			Runtime.getRuntime().exec("notepad");
			// 打开word
			Runtime.getRuntime().exec("cmd /c start Winword");
			// 执行批处理
			Runtime.getRuntime().exec("cmd.exe /C start d:/demo/run.bat");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Process p = Runtime.getRuntime().exec("d:/demo/run.bat");
			InputStream in = p.getInputStream();
			String line = null;
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}			
			in.close();	
			p.waitFor();
		} catch (InterruptedException e) {   
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
