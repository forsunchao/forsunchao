import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

	public static void main(String[] args) {
		/*
		 * 简单认识正则表达式的概念
		 */
//		p("abc".matches("..."));//一个点代表一个字母
//		p("a8729a".replaceAll("\\d", "-"));//所有数字换成横线
//		Pattern p = Pattern.compile("[a-z]{3}");//匹配三个a-z的字符串
//		Matcher m = p.matcher("fgh");
//		p(m.matches());
//		p("fgha".matches("[a-z]{3}"));
		
		
		/*
		初步认识. * + ?
		*:代表0个或多个
		+:代表一个或多个
		?:代表0个或一个
		*/
//		p("a".matches("."));//true
//		p("aa".matches("aa"));//true
//		p("aaaa".matches("a*"));//true
//		p("aaaa".matches("a+"));//true
//		p("".matches("a*"));//true
//		p("aaaa".matches("a?"));//false
//		p("".matches("a?"));//true
//		p("a".matches("a?"));//true
//		p("214523145234532".matches("\\d{3,100}"));//true,数字，至少三次，不超过100次
//		p("192.168.0.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));//false
//		p("192".matches("[0-2][0-9][0-9]"));//true
		
		
		/*范围*/
//		p("a".matches("[abc]"));//true
//		p("a".matches("[^abc]"));//false，除了abc中的
//		p("A".matches("[a-zA-Z]"));//true
//		p("A".matches("[a-z]|[A-Z]"));//true
//		p("A".matches("[a-z[A-Z]]"));//true
//		p("R".matches("[A-Z&&[RFG]]"));//true,A-Z中的RFG三者之一
		
		
		/*
		 * 认识\s \w \d \
		 */
//		p(" \n\r\t".matches("\\s{4}"));//true
//		p(" ".matches("\\S"));//false
//		p("a_8".matches("\\w{3}"));//true
//		p("abc888&^%".matches("[a-z]{1,3}\\d+[&^#%]+"));//true
//		p("\\".matches("\\\\"));//true
		
		
		/*POSIX Style*/
//		p("a".matches("\\p{Lower}"));
		
		/*boundary*/
//		p("hello sir".matches("^h.*"));//true
//		p("hello sir".matches(".*ir$"));//true
//		p("hello sir".matches("^h[a-z]{1,3}o\\b.*"));//true
//		p("hellosir".matches("^h[a-z]{1,3}o\\b.*"));//false
		
		/*whilte lines,空白行*/
//		p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));//true
//		/*练习*/
//		p("aaa 8888c".matches(".*\\d{4}."));//true
//		p("aaa 8888c".matches(".*\\b\\d{4}."));//true
//		p("aaa8888c".matches(".*\\d{4}."));//true
//		p("aaa8888c".matches(".*\\b\\d{4}."));//false
		
		
		/*email*/
//		p("asdfasdfsafsf@dsdfsdf.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
		
		
		/*matches find lookingAt*/
//		Pattern p = Pattern.compile("\\d{3,5}");
//		String s = "123-34345-234-00";
//		Matcher m = p.matcher(s);
//		p(m.matches());//matchaes跟find会冲突，matches会先读取4个，然后find会继续读
//		m.reset();//回复最初始的状态
//		p(m.find());//找跟子串匹配的
//		p(m.start() + "-" + m.end());//起始位置和结束位置的下标
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.lookingAt());//每次从头开始找
//		p(m.lookingAt());
//		p(m.lookingAt());
//		p(m.lookingAt());
		
		
		/*replacement，字符串的替换*/
//		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//		Matcher m = p.matcher("java Java JAVa JaVa IloveJAVA you hateJava afasdfasdf");
//		StringBuffer buf = new StringBuffer();
//		int i=0;
//		while(m.find()) {//单数Java串转换成大写，双数Java串转换成小写
//			i++;
//			if(i%2 == 0) {
//				m.appendReplacement(buf, "java");
//			} else {
//				m.appendReplacement(buf, "JAVA");
//			}
//		}
//		m.appendTail(buf);//添加不需被替换的尾巴
//		p(buf);
		
		
		/*group，分组*/
//		Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
//		String s = "123aa-34345bb-234cc-00";
//		Matcher m = p.matcher(s);
//		while(m.find()) {
//			p(m.group());
//		}
		
		
		/*qulifiers，修订词，限定词，以下一般是论坛上的写法*/
//		Pattern p = Pattern.compile(".{3,10}+[0-9]");
//		String s = "aaaa5bbbb68";
//		Matcher m = p.matcher(s);
//		if(m.find())
//			p(m.start() + "-" + m.end());
//		else 
//			p("not match!");
		
		
		/*non-capturing groups*/
//		Pattern p = Pattern.compile(".{3}(?=a)");
//		String s = "444a66b";
//		Matcher m = p.matcher(s);
//		while(m.find()) {
//			p(m.group());
//		}
		
		
		/*back refenrences*/
//		Pattern p = Pattern.compile("(\\d(\\d))\\2");
//		String s = "122";
//		Matcher m = p.matcher(s);
//		p(m.matches());
		
		
		/*flags的简写*/
//		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//		p("Java".matches("(?i)(java)"));
	}
	
	public static void p(Object o) {
		System.out.println(o);
	}

}
