package ExceptionDemo;
public class ExceptionDemo02{
	public static void main(String args[]){
		int i = 10 ;
		int j = 0 ;
		System.out.println("========== ���㿪ʼ ===========") ;
		try{
			int temp = i / j ;
			System.out.println("��������" + temp) ;
		}catch(ArithmeticException e){
			System.out.println("��������ѧ�쳣��" + e) ;
		}
		System.out.println("========== ������� ===========") ;
	}
};