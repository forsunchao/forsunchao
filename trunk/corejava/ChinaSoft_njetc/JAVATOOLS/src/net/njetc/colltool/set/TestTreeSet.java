package net.njetc.colltool.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import net.njetc.bean.Student;

public class TestTreeSet {

	/**
	 * 
	 */
	public static void main(String[] args) {
        //����һ���µĿ� set���� set ����Ԫ�ص���Ȼ˳������
		Set<String> strSet = new TreeSet<String>();
		strSet.add("naning");
		strSet.add("shanghai");
		strSet.add("beijing");
		strSet.add("shanghai");
		strSet.add("shanghai");
		strSet.add("aomeng");
		strSet.add("qingdao");
		strSet.add("shangao");
		strSet.add(null);
		strSet.add(null);
		Iterator<String> itStr = strSet.iterator();
		while (itStr.hasNext()) {
			System.out.println(itStr.next());
	   }
        //�����Զ���ıȽ�������һ��Set����
		Set<Student> stuSet = new TreeSet<Student>(new StuComparator());
		stuSet.add(new Student("����", 1004));
		stuSet.add(new Student("����", 1001));
		stuSet.add(new Student("����", 1002));
		stuSet.add(new Student("����", 1003));
		Iterator<Student> itStu = stuSet.iterator();
		while (itStu.hasNext()) {
			System.out.println(itStu.next().getName());
		}
		
		
	}

}
