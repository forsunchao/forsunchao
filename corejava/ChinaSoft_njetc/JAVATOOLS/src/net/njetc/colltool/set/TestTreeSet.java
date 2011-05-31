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
        //构造一个新的空 set，该 set 按照元素的自然顺序排序。
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
        //利用自定义的比较器构造一个Set对象
		Set<Student> stuSet = new TreeSet<Student>(new StuComparator());
		stuSet.add(new Student("张三", 1004));
		stuSet.add(new Student("李四", 1001));
		stuSet.add(new Student("王二", 1002));
		stuSet.add(new Student("孙武", 1003));
		Iterator<Student> itStu = stuSet.iterator();
		while (itStu.hasNext()) {
			System.out.println(itStu.next().getName());
		}
		
		
	}

}
