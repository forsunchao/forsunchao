package OODemo;
class Person9{
	private String name	;	// ��ʾ�˵�����
	private int age ;		// ��ʾ�˵�����
	public void tell(){	// ����˵���ķ���
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class OODemo09{
	public static void main(String args[]){
		Person9 per = new Person9() ;	// ʵ��������
//		per.name = "����" ;		// Ϊname���Ը�ֵ
//		per.age = -30;
		per.tell() ;
	}
};