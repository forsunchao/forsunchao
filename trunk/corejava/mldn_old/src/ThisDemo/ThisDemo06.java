package ThisDemo;
class Person9{
	public void print(){
		System.out.println(this) ;//thisָ������
	}
};
public class ThisDemo06{
	public static void main(String args[]){
		Person9 per1 = new Person9() ;
		Person9 per2 = new Person9() ;
		System.out.println(per1) ;
		per1.print() ;//��ӡʵ�������Ķ�����
		System.out.println(per2) ;
		per2.print() ;
	}
};