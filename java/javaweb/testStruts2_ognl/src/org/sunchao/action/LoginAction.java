package org.sunchao.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.sunchao.vo.Student;
import org.sunchao.vo.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements RequestAware,
		SessionAware {
	private User user;
	private int[] array = new int[5];
	private List testList = new ArrayList();
	private Set testSet = new HashSet();
	private Map testMap = new HashMap();
	private List stus = new ArrayList();
	private Map request;
	private Map session;

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
		if (user.getUsername().trim().equals("sunchao")
				&& user.getPassword().trim().equals("123456")) {
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

			stus.add(new Student("张三", "北大", 21));
			stus.add(new Student("李四", "清华", 24));
			stus.add(new Student("王五", "南大", 22));
			
			request.put("req", "requset属性值");
			session.put("ses", "session属性值");

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

	public List getStus() {
		return stus;
	}

	public void setStus(List stus) {
		this.stus = stus;
	}

	public void setRequest(Map request) {
		this.request = request;
	}

	public void setSession(Map session) {
		this.session = session;
	}
}
