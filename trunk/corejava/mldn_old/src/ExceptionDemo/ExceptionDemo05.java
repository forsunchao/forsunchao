package ExceptionDemo;
public class ExceptionDemo05{
	public static void main(String args[]){
		int i = 0 ;
		int j = 0 ;
		System.out.println("========== ���㿪ʼ ===========") ;
		try{
			i = Integer.parseInt(args[0]) ;
			j = Integer.parseInt(args[1]) ;
			int temp = i / j ;
			System.out.println("��������" + temp) ;
		}catch(ArithmeticException e){
			System.out.println("��������ѧ�쳣��" + e) ;
		}catch(NumberFormatException e){
			System.out.println("����Ĳ������֣�" + e) ;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Ĳ����������ԣ�" + e) ;
		}finally{
			System.out.println("** �����Ƿ����쳣���Ҷ�ִ�С�") ;
		}
		System.out.println("========== ������� ===========") ;
	}
};