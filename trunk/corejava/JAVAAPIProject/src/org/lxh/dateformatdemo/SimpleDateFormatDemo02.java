package org.lxh.dateformatdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {
	public static void main(String[] args) throws Exception {
		String str = args[0].trim();// 接收参数
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		Date date = sdf.parse(str);// 提取格式中的日期
		System.out.println(date);
	}

}
