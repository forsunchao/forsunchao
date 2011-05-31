package net.njetc.format;

import java.text.DecimalFormat;

public class TestNumFormat {

	/**
	 * 格式化数字
	 */
	public static void main(String[] args) {
		DecimalFormat   nubFormat= new DecimalFormat("###,###");
		//格式化整数
        System.out.println(nubFormat.format(12345));
        //格式化小数
        nubFormat= new DecimalFormat("###,###.000$");
        System.out.println(nubFormat.format(1291889.6864666));
	}
}
