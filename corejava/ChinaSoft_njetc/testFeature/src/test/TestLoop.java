package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestLoop {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("how");
		list.add("are");
		list.add("you");

		// 旧的循环
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}

		// 新的循环
		for (String str : list) {
			System.out.println(str);
		}
	}
}
