package org.lxh.obserdemo;

public class TestObserver {
	public static void main(String[] args) {
		House h = new House(3000.0f);
		Person per1 = new Person();
		Person per2 = new Person();
		Person per3 = new Person();
		h.addObserver(per1);// ����һ���۲���
		h.addObserver(per2);// ����һ���۲���
		h.addObserver(per3);// ����һ���۲���
		h.setPrice(6000.0f);// Ҫ֪ͨ�۲��������Ѿ����ı���
	}

}
