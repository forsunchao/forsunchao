package org.lxh.systemdemo;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "������" + this.name + "�����䣺" + this.age;
	}

	public void finalize() throws Throwable {
		System.out.println("�ұ������ˣ����군�ˡ�������" + this + "��");
	}

}

public class SystemDemo02 {
	public static void main(String[] args) {
		Person per = new Person("����", 99);
		per = null; // ȡ������
		System.gc();// ǿ�ƽ��������ռ�
	}
}
