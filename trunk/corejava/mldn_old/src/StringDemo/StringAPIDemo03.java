package StringDemo;
public class StringAPIDemo03{
	public static void main(String args[]){
		String str = "hello world !!!@" ;
		byte b[] = str.getBytes() ;	// ���ַ�����Ϊbyte����
		String str1 = new String(b) ;	// ��ȫ�����ַ��������±�ΪString
		String str2 = new String(b,0,5) ;	// ��0~5���ַ��������±�ΪString
		System.out.println(str1) ;
		System.out.println(str2) ;
	}
};
