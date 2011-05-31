package net.njetc.systool;

import java.io.IOException;
import java.util.Date;

public class TestSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String[] snCitys = { "南京", "苏州", "无锡", "常州", "镇江" };
			String[] sbCitys = { "扬州", "泰州", "南通", "淮安", "盐城", "宿迁", "连云港",
					"徐州" };
			String[] jsCitys = new String[snCitys.length + sbCitys.length];
			System.arraycopy(snCitys, 0, jsCitys, 0, snCitys.length);
			System.arraycopy(sbCitys, 0, jsCitys, snCitys.length,sbCitys.length);
			int length = jsCitys.length;
			for (int index = 0; index < length; index++) {
				System.out.println(jsCitys[index]);
			}

		/*	System.out.println("请输入一个字符：");
			char ch = (char) System.in.read();
			System.out.println("你输入一个字符为：" + ch);*/

			// 返回以毫秒为单位的当前时间
			Date date = new Date(System.currentTimeMillis());
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
