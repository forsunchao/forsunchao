package net.njetc.systool;

import java.io.IOException;
import java.util.Date;

public class TestSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String[] snCitys = { "�Ͼ�", "����", "����", "����", "��" };
			String[] sbCitys = { "����", "̩��", "��ͨ", "����", "�γ�", "��Ǩ", "���Ƹ�",
					"����" };
			String[] jsCitys = new String[snCitys.length + sbCitys.length];
			System.arraycopy(snCitys, 0, jsCitys, 0, snCitys.length);
			System.arraycopy(sbCitys, 0, jsCitys, snCitys.length,sbCitys.length);
			int length = jsCitys.length;
			for (int index = 0; index < length; index++) {
				System.out.println(jsCitys[index]);
			}

		/*	System.out.println("������һ���ַ���");
			char ch = (char) System.in.read();
			System.out.println("������һ���ַ�Ϊ��" + ch);*/

			// �����Ժ���Ϊ��λ�ĵ�ǰʱ��
			Date date = new Date(System.currentTimeMillis());
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
