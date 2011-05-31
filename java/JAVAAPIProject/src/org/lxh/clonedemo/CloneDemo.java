package org.lxh.clonedemo;

class Person implements Cloneable {// ��ʾ����Ķ�����Ա���¡
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "������" + this.getName();
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person per1 = new Person("����");
		Person per2 = (Person)per1.clone() ;		
		per2.setName("����") ;
		System.out.println(per1) ;
		System.out.println(per2) ;
	}

}
