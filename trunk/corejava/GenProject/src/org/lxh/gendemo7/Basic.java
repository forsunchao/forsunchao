package org.lxh.gendemo7;

public class Basic implements Info {
	private String name ;
	private int age ;

	public String toString() {
		return "������" + this.name + "���䣺 " + this.age;
	}

	public Basic(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
