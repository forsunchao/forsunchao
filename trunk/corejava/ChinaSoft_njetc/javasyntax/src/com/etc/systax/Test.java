package com.etc.systax;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public void mod(List list) {
		list.remove(0);// 删除第一个数组元
	}

	public static void main(String args[]) {
		Test test = new Test();
		List list = new ArrayList();
		list.add("abc");
		list.add("def");
		System.out.println(list);
		test.mod(list);
		System.out.println(list);
	}
}
