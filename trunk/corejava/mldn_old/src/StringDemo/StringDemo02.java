package StringDemo;
public class StringDemo02{
	public static void main(String args[]){
		String str1 = "hello" ;	// ʹ��ֱ�Ӹ�ֵ�ķ�ʽ���
		String str2 = new String("hello") ;	// ͨ�����췽�����
		String str3 = str2 ;	// ͨ�����췽�����
		System.out.println("str1 == str2 --> " + (str1==str2)) ;	// false
		System.out.println("str1 == str3 --> " + (str1==str3)) ;	// false
		System.out.println("str2 == str3 --> " + (str2==str3)) ;	// true
	}
};