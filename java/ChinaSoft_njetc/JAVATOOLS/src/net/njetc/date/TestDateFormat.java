package net.njetc.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDateFormat {

	/**
	 * 格式化日期
	 */
	public static void main(String[] args) {
		//用默认的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
		DateFormat  df= new SimpleDateFormat("yyyy-MM-HH mm:ss:SS a");
		System.out.println(df.format(new Date()));
        //用给定的模式和给定语言环境的默认日期格式符号构造 SimpleDateFormat
		df= new SimpleDateFormat("yyyy-MM-KK mm:ss:SS a",Locale.US);
		System.out.println(df.format(new Date()));

	}

}
