package org.lxh.numberformatdemo;

import java.text.DecimalFormat;

class FormatDemo {
	public void format(String pattern, double value) { // �˷���ר�����ڸ�ʽ��
		DecimalFormat format = new DecimalFormat(pattern); // ָ��������ģ��
		String str = format.format(value);// ת������
		System.out.println("���ְ��ո�ʽ��" + pattern + "����ת������ǣ�" + str);
	}
}

public class DecimalFormatDemo {
	public static void main(String[] args) {
		FormatDemo format = new FormatDemo() ;
		format.format("000,000.000", 23456.45) ;
		format.format("###,###.###", 23456.45) ;
		format.format("000,000.000��", 23456.45) ;
		format.format("###,###.###��", 23456.45) ;
		format.format("##.###%", 0.34567) ;
		format.format("00.###%", 0.034567) ;
	}

}
