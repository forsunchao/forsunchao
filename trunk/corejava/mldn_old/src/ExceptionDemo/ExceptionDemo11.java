/**
 * �����쳣�ı�׼�����ʽ
 */
package ExceptionDemo;
class Math3{
	public int div(int i,int j) throws Exception{
		System.out.println("======== ���г�������֮ǰ ============") ;
		int temp = 0 ;
		try{
			temp = i / j ;
		}catch(Exception e){
			throw e ;	// �׳��쳣
		}finally{
			System.out.println("======== �����������֮�� ============") ;
		}
		return temp ;
	}
};
public class ExceptionDemo11{
	public static void main(String args[]){
		Math3 m = new Math3() ;
		try{
			int temp = m.div(10,0) ;
			System.out.println(temp) ;
		}catch(Exception e){
			System.out.println(e) ;
		}		
	}
};