package net.njetc.systool;

import java.io.IOException;

public class TestRuntime {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// ͨ�� getRuntime ������ȡ��ǰ����ʱ
		Runtime rt = Runtime.getRuntime();
		try {
			// �ڵ����Ľ�����ִ��ָ�����ַ�������
			// calc��ʾ���ü�����������ƵĻ���notepad(���±�),mspaint(��ͼ)�ȵȡ�
			rt.exec("calc");
			rt.exec("notepad");
			rt.exec("mspaint");
			// ����Tomcat
			rt.exec("cmd /c C:\\Program Files\\Apache Software Foundation\\Tomcat 6.0\\bin\\tomcat6.exe");
			// ֹͣMySQL����
			rt.exec("cmd /c net stop MySQL");
			

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
