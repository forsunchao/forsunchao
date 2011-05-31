package org.lxh.obserdemo;

import java.util.Observable;

public class House extends Observable {
	private float price;

	public House(float price) {
		this.price = price;
	}
	public String toString(){
		return "����" ;
	}
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		super.setChanged();// ֪ͨ�����Ѿ����Ա��޸���
		this.price = price;
		// һ���޸ģ����ʾ�۸�ı䣬��ô�۸�ı�֮��ʵ����Ӧ������֪ͨ���еĹ۲���
		super.notifyObservers(price);// ֪ͨ���еĹ۲����Ѿ��ı�
	}
}
