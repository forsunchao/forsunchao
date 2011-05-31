package IntegerDemo;
public class IntegerDemo01{
	public static void main(String args[]){
		int i = 10 ;
		Integer i2 = new Integer(i) ;	// ×°Ïä²Ù×÷
		int j = i2.intValue() ;		// ²ğÏä²Ù×÷
		System.out.println(j * j) ;
	}
};