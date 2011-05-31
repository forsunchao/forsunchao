package net.njetc.colltool.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.njetc.bean.Student;
import net.njetc.colltool.set.StuComparator;

public class TestCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("shanghai");
		strList.add("nanjing");
		strList.add("guangdong");
		strList.add("shenzheng");
		strList.add("xianggang");
		//strList.add(null);
	    int size=strList.size();
	    for(int index=0;index<size;index++){
	    	System.out.println(strList.get(index));
	   
	    }
	    System.out.println("排序");
	    Collections.sort(strList);
	    
	    for(int index=0;index<size;index++){
	    	System.out.println(strList.get(index));
	   
	    }
	    
	    List<Student> stuList = new ArrayList<Student>();
	    Student stu1 = new Student("张三", 1004);
	    Student stu2 = new Student("李四", 1001);
	    Student stu3= new Student("王二",  1010);
	    Student stu4 = new Student("赵五", 1011);
	    Student stu5 = new Student("钱一", 1020);
	    stuList.add(stu1);
	    stuList.add(stu2);
	    stuList.add(stu3);
	    stuList.add(stu4);
	    stuList.add(stu5);
	    size=stuList.size();
	    for(int index=0;index<size;index++){
	    	System.out.println(stuList.get(index).getName());
	   
	    }
	    
	    System.out.println("根据学号排序后..");
	    
		Collections.sort(stuList,new StuComparator());
		
		size=stuList.size();
	    for(int index=0;index<size;index++){
	    	System.out.println(stuList.get(index).getName());
	   
	    }
	}

}
