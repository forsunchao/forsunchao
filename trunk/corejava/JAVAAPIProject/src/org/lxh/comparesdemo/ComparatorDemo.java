package org.lxh.comparesdemo;
import java.util.Arrays;

public class ComparatorDemo {
	public static void main(String[] args) {
		Student stu[] = { new Student(1, "����", 21, 99.1f),
				new Student(2, "����", 20, 99.1f),
				new Student(3, "����", 21, 89.1f),
				new Student(4, "����", 21, 80.1f),
				new Student(5, "����", 19, 80.1f) };
		System.out.println("============== ��������֮ǰ ===============");
		print(stu);
		System.out.println("============== ��������֮�� ===============");
		Arrays.sort(stu,new StudentComparator());// ����
		print(stu);
	}

	public static void print(Student stu[]) {
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
	}
}
