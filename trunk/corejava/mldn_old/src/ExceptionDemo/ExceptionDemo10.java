package ExceptionDemo;
public class ExceptionDemo10{
	public static void main(String args[]){
		try{
			throw new Exception("������ġ�") ;	// ��Ϊ�׳�
		}catch(Exception e){
			System.out.println(e) ;
		}
	}
};