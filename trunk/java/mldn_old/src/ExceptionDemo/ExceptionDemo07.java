package ExceptionDemo;
public class ExceptionDemo07{
	public static void main(String args[]){
		int i = 0 ;
		int j = 0 ;
		System.out.println("========== ���㿪ʼ ===========") ;
		try{
			i = Integer.parseInt(args[0]) ;
			j = Integer.parseInt(args[1]) ;
			int temp = i / j ;
			System.out.println("��������" + temp) ;
		}catch(Exception e){
			System.out.println("�����쳣��" + e) ;
		}finally{
			System.out.println("** �����Ƿ����쳣���Ҷ�ִ�С�") ;
		}
		System.out.println("========== ������� ===========") ;
	}
};