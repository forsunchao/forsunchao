package OODemo;
class Person6{
	String name	;	// ��ʾ�˵�����
	int age ;		// ��ʾ�˵�����
	public void tell(){	// ����˵���ķ���
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class OODemo06{
	public static void main(String args[]){
		Person6 per1 = null ;	// ��������
		Person6 per2 = null ;	// ��������
		per1 = new Person6() ;	// ʵ��������
		per2 = per1 ;			// ���ô���
		per1.name = "����" ;		// Ϊ���ָ�ֵ
		per1.age = 30 ;			// Ϊ���丳ֵ
		per2.age = 33 ;
		per1.tell() ;			// ���÷���
		per2.tell() ;
	}
};