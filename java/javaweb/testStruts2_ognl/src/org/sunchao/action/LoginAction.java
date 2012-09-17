package org.sunchao.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sunchao.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private User user;
	private int[] array = new int[5];
	private List testList = new ArrayList();
	private Set testSet = new HashSet();
	private Map testMap = new HashMap();
	
	public static String get2() {
		return "LoginAction中的静态方法get2()";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() throws Exception {
		if(user.getUsername().trim().equals("sunchao") && user.getPassword().trim().equals("123456")) {
			for (int i = 0; i < 5; i++) {
				array[i] = i;
			}
			
			testList.add("list1");
			testList.add("list2");
			testList.add("list3");
			testList.add("list4");
			testList.add("list5");
			
			testSet.add("set1");
			testSet.add("set2");
			testSet.add("set3");
			testSet.add("set1");
			testSet.add("set2");
			
			testMap.put("key1", "value1");
			testMap.put("key2", "value2");
			testMap.put("key3", "value3");
			testMap.put("key4", "value4");
			testMap.put("key5", "value5");
			
			return "loginSuc";
		} else {
			return "loginFail";
		}
	}

	public List getTestList() {
		return testList;
	}

	public void setTestList(List testList) {
		this.testList = testList;
	}

	public Set getTestSet() {
		return testSet;
	}

	public void setTestSet(Set testSet) {
		this.testSet = testSet;
	}

	public Map getTestMap() {
		return testMap;
	}

	public void setTestMap(Map testMap) {
		this.testMap = testMap;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
}
