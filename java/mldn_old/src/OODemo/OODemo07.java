package OODemo;
class Person7{
	String name	;	// ��ʾ�˵�����
	int age ;		// ��ʾ�˵�����
	public void tell(){	// ����˵���ķ���
		System.out.println("������" + name + "�����䣺" + age) ;
	}
};
public class OODemo07{
	public static void main(String args[]){
		Person7 per1 = null ;	// ��������
		Person7 per2 = null ;	// ��������
		per1 = new Person7() ;	// ʵ��������
		per2 = new Person7() ;	// ʵ��������
		per2.name = "����" ;	
		per2 = per1 ;			// ���ô���
		per1.name = "����" ;		// Ϊ���ָ�ֵ
		per1.age = 30 ;			// Ϊ���丳ֵ
		per2.age = 33 ;
		per1.tell() ;			// ���÷���
		per2.tell() ;
	}
};