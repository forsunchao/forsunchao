package StringDemo;
public class StringAPIDemo02{
	public static void main(String args[]){
		String str = "hello world !!!@" ;
		char c[] = str.toCharArray() ;		// ���ַ�����Ϊ�ַ�����
		for(int i=0;i<c.length;i++){
			System.out.print(c[i] + "��");
		}
		String str1 = new String(c) ;	// ��ȫ�����ַ��������±�ΪString
		String str2 = new String(c,0,5) ;	// ��0~5���ַ��������±�ΪString
		System.out.println("\n"+str1) ;
		System.out.println(str2) ;
	}
};
