package org.lxh.obserdemo;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
	// arg��ʾ�ı�֮�������
	// o��ʾ�۲�Ķ���
	public void update(Observable o, Object arg) {
		System.out.println(o + "*** ���۲�Ĳ����������ġ�" + arg);
	}

}
