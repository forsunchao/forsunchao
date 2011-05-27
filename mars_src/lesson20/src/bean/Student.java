package bean;

import java.util.Set;

public class Student {
	private String name;
	private String sex;
	private Set<Lesson> lessons;

	public Student() {
	}

	public Student(String name, String sex, Set<Lesson> lessons) {
		super();
		this.name = name;
		this.sex = sex;
		this.lessons = lessons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Set<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(Set<Lesson> lessons) {
		this.lessons = lessons;
	}

}
