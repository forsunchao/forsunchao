package net.njetc.strtool;


public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//定义一个字符串常量
		String  constr="chinasoft";
		//定义一个字符串变量
		String str=new String("chinasoft");
		//比较两个字符串的值是否相等
		System.out.println(constr.equals(str));
		//比较两个字符是否相同
		System.out.println(constr==str);
		//获取字符串的长度
		System.out.println("字符串\"chinasoft\"长度为:"+str.length());
		//将指定字符串联到此字符串的结尾
		String str1="welcome to ";
		System.out.println(str1.concat(str));
		//返回指定字符在此字符串中第一次出现处的索引
	    str="welcome to nanjing etc";
	    System.out.println(str.indexOf("c"));
	    System.out.println(str.indexOf("to"));
	    // 测试此字符串是否以指定的前缀开始
	    System.out.println(str.startsWith("welcome"));
	    //使用默认语言环境的规则将此 String 中的所有字符都转换为大写
	    System.out.println(str.toUpperCase());
		//去空格
	    str="  njetc    ";
	    System.out.println(str.trim());
	    //切割字符串
	    str="welcome&to&nanjing&etc";
	    String []strArray=str.split("&");
	    System.out.println(strArray.length);
		
	}

}
