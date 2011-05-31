package org.lxh.comparesdemo;

public class Student {
	private int stuno;
	private String name;
	private int age;
	private float score;

	public Student(int stuno, String name, int age, float score) {
		this.stuno = stuno;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public boolean equals(Object obj) { // ��дequals����ɶ���ıȽ�
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student stu = (Student) obj; // ����ת��
		if (this.stuno == stu.stuno && this.name.equals(stu.name)
				&& this.age == stu.age && this.score == stu.score) {
			return true;	// �������
		} else {
			return false;	// ���󲻵�
		}
	}

	public String toString() { // ��дtoString()
		return "ѧ����ţ�" + this.stuno + "��������" + this.name + "�����䣺" + this.age
				+ "���ɼ���" + this.score;
	}

	public int getStuno() {
		return stuno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getScore() {
		return score;
	}
	
}