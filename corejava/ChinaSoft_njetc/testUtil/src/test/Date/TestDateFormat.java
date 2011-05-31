package test.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) throws Exception {
		Date date = new Date();		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(date));
		
		String str = "2008-08-08 08:08:08";
		System.out.println(format.parse(str));
	}
}
