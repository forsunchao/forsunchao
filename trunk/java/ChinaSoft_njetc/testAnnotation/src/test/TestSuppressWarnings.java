package test;

import java.util.ArrayList;
import java.util.List;

public class TestSuppressWarnings {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("1");
	}
}
