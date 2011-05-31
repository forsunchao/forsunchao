package test;

import java.util.ArrayList;
import java.util.List;

public class TestBox {
	public static void main(String args[]) {
		// 旧的代码
		Integer intObject = new Integer(20);
		int intPrimitive = 10;
		List<Integer> list = new ArrayList<Integer>();
		list.add(intObject);
		list.add(new Integer(intPrimitive));
		int intPrimitive2 = intObject.intValue();
		System.out.println(intPrimitive2);
		
		// 新的代码
		list.add(intPrimitive);//自动装箱
		int intPrimitive3 = intObject;//自动拆箱
		System.out.println(intPrimitive3);
	}
}
