import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

	public static void main(String[] args) {
		/*
		 * ����ʶ������ʽ�ĸ���
		 */
//		p("abc".matches("..."));//һ�������һ����ĸ
//		p("a8729a".replaceAll("\\d", "-"));//�������ֻ��ɺ���
//		Pattern p = Pattern.compile("[a-z]{3}");//ƥ������a-z���ַ���
//		Matcher m = p.matcher("fgh");
//		p(m.matches());
//		p("fgha".matches("[a-z]{3}"));
		
		
		/*
		������ʶ. * + ?
		*:����0������
		+:����һ������
		?:����0����һ��
		*/
//		p("a".matches("."));//true
//		p("aa".matches("aa"));//true
//		p("aaaa".matches("a*"));//true
//		p("aaaa".matches("a+"));//true
//		p("".matches("a*"));//true
//		p("aaaa".matches("a?"));//false
//		p("".matches("a?"));//true
//		p("a".matches("a?"));//true
//		p("214523145234532".matches("\\d{3,100}"));//true,���֣��������Σ�������100��
//		p("192.168.0.aaa".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));//false
//		p("192".matches("[0-2][0-9][0-9]"));//true
		
		
		/*��Χ*/
//		p("a".matches("[abc]"));//true
//		p("a".matches("[^abc]"));//false������abc�е�
//		p("A".matches("[a-zA-Z]"));//true
//		p("A".matches("[a-z]|[A-Z]"));//true
//		p("A".matches("[a-z[A-Z]]"));//true
//		p("R".matches("[A-Z&&[RFG]]"));//true,A-Z�е�RFG����֮һ
		
		
		/*
		 * ��ʶ\s \w \d \
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
		
		/*whilte lines,�հ���*/
//		p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));//true
//		/*��ϰ*/
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
//		p(m.matches());//matchaes��find���ͻ��matches���ȶ�ȡ4����Ȼ��find�������
//		m.reset();//�ظ����ʼ��״̬
//		p(m.find());//�Ҹ��Ӵ�ƥ���
//		p(m.start() + "-" + m.end());//��ʼλ�úͽ���λ�õ��±�
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.find());
//		p(m.start() + "-" + m.end());
//		p(m.lookingAt());//ÿ�δ�ͷ��ʼ��
//		p(m.lookingAt());
//		p(m.lookingAt());
//		p(m.lookingAt());
		
		
		/*replacement���ַ������滻*/
//		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//		Matcher m = p.matcher("java Java JAVa JaVa IloveJAVA you hateJava afasdfasdf");
//		StringBuffer buf = new StringBuffer();
//		int i=0;
//		while(m.find()) {//����Java��ת���ɴ�д��˫��Java��ת����Сд
//			i++;
//			if(i%2 == 0) {
//				m.appendReplacement(buf, "java");
//			} else {
//				m.appendReplacement(buf, "JAVA");
//			}
//		}
//		m.appendTail(buf);//��Ӳ��豻�滻��β��
//		p(buf);
		
		
		/*group������*/
//		Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
//		String s = "123aa-34345bb-234cc-00";
//		Matcher m = p.matcher(s);
//		while(m.find()) {
//			p(m.group());
//		}
		
		
		/*qulifiers���޶��ʣ��޶��ʣ�����һ������̳�ϵ�д��*/
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
		
		
		/*flags�ļ�д*/
//		Pattern p = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
//		p("Java".matches("(?i)(java)"));
	}
	
	public static void p(Object o) {
		System.out.println(o);
	}

}
