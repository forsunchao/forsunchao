package net.njetc.format;

import java.text.DecimalFormat;

public class TestNumFormat {

	/**
	 * ��ʽ������
	 */
	public static void main(String[] args) {
		DecimalFormat   nubFormat= new DecimalFormat("###,###");
		//��ʽ������
        System.out.println(nubFormat.format(12345));
        //��ʽ��С��
        nubFormat= new DecimalFormat("###,###.000$");
        System.out.println(nubFormat.format(1291889.6864666));
	}
}
