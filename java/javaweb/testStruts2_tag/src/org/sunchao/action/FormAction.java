package org.sunchao.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport {
	private List province;//ʹ��map���͸���

	public List getProvince() {
		return province;
	}

	public void setProvince(List province) {
		this.province = province;
	}
	
	public FormAction() {
		province = new ArrayList();
		province.add("����ʡ");
		province.add("�㽭ʡ");
		province.add("����ʡ");
		province.add("����ʡ");
		province.add("�ӱ�ʡ");
		province.add("���ɹ�ʡ");
	}
}
