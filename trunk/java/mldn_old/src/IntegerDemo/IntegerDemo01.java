package IntegerDemo;
public class IntegerDemo01{
	public static void main(String args[]){
		int i = 10 ;
		Integer i2 = new Integer(i) ;	// װ�����
		int j = i2.intValue() ;		// �������
		System.out.println(j * j) ;
	}
};