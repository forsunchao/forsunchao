package net.njetc.colltool.set;

import java.util.Comparator;

import net.njetc.bean.Student;

/**
 * 
 * Student�Ƚ����࣬����Student������ѧ����Ž��бȽ�
 * 
 */
public class StuComparator implements  Comparator {

	public int compare(Object stuOb1, Object stuOb2) {
		//
		Student stu1 = (Student) stuOb1;
		Student stu2 = (Student) stuOb2;
		int stuid1 = stu1.getStuid();
		int stuid2 = stu2.getStuid();
		if (stuid1 > stuid2) {
			return -1;
		} else if (stuid1 < stuid2) {
			return 1;
		} else {
			return 0;
		}

	}

}
