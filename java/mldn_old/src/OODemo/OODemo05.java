package OODemo;
class Person5{
	String name	;	// ��ʾ�˵�����
	int age ;		// ��ʾ�˵�����
	public void tell(){	// ����˵���ķ���
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class OODemo05{
	public static void main(String args[]){
		Person5 per1 = null ;	// ��������
		Person5 per2 = null ;	// ��������
		per1 = new Person5() ;	// ʵ��������
		per2 = new Person5()	;	// ʵ��������
		per1.name = "����" ;		// Ϊ���ָ�ֵ
		per1.age = 30 ;			// Ϊ���丳ֵ
		per1.tell() ;			// ���÷���
		per2.name = "����" ;
		per2.age = 33 ;
		per2.tell() ;
	}
};