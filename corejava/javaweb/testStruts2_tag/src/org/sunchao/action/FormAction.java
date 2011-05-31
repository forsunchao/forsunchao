package org.sunchao.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport {
	private List province;//使用map类型更好

	public List getProvince() {
		return province;
	}

	public void setProvince(List province) {
		this.province = province;
	}
	
	public FormAction() {
		province = new ArrayList();
		province.add("江苏省");
		province.add("浙江省");
		province.add("江西省");
		province.add("湖南省");
		province.add("河北省");
		province.add("内蒙古省");
	}
}
