package ExceptionDemo;
public class ExceptionDemo04{
	public static void main(String args[]){
		int i = Integer.parseInt(args[0]) ;
		int j = Integer.parseInt(args[1]) ;
		System.out.println("========== ���㿪ʼ ===========") ;
		try{
			int temp = i / j ;
			System.out.println("��������" + temp) ;
		}catch(ArithmeticException e){
			System.out.println("��������ѧ�쳣��" + e) ;
		}finally{
			System.out.println("** �����Ƿ����쳣���Ҷ�ִ�С�") ;
		}
		System.out.println("========== ������� ===========") ;
	}
};