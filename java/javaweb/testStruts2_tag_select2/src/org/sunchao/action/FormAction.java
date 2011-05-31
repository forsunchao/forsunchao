package org.sunchao.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sunchao.vo.Province;
import org.sunchao.vo.School;

import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport {
	private List<Province> province;
	private Map<Province, List<School>> school;

	public FormAction(List<Province> province, Map<Province, List<School>> school) {
		super();
		this.province = province;
		this.school = school;
	}

	public FormAction() {// 构造一个省，里面拥有学校
		province = new ArrayList<Province>();
		Province p1 = new Province(1, "江苏省");
		Province p2 = new Province(2, "北京市");
		Province p3 = new Province(3, "上海市");
		Province p4 = new Province(4, "浙江省");
		province.add(p1);
		province.add(p2);
		province.add(p3);
		province.add(p4);
		//江苏省的学校
		School s1 = new School(1, "南京大学");
		School s2 = new School(2, "东南大学");
		School s3 = new School(3, "南理工大学");
		School s4 = new School(4, "南京农业大学");
		//北京市的学校
		School s5 = new School(5, "清华大学");
		School s6 = new School(6, "北京大学");
		School s7 = new School(7, "北京农业大学");
		School s8 = new School(8, "北京外国语学院");
		//上海市的学校
		School s9 = new School(9, "复旦大学");
		School s10 = new School(10, "上海交通大学");
		School s11 = new School(11, "上海外国语学院");
		School s12 = new School(12, "上海体育大学");
		//浙江省的学校
		School s13 = new School(13, "浙江大学");
		School s14 = new School(14, "义乌大学");
		School s15 = new School(15, "杭州大学");
		School s16 = new School(16, "杭州工业大学");
		
		List ss1 = new ArrayList<School>();
		ss1.add(s1);
		ss1.add(s2);
		ss1.add(s3);
		ss1.add(s4);
		
		List ss2 = new ArrayList<School>();
		ss2.add(s5);
		ss2.add(s6);
		ss2.add(s7);
		ss2.add(s8);
		
		List ss3 = new ArrayList<School>();
		ss3.add(s9);
		ss3.add(s10);
		ss3.add(s11);
		ss3.add(s12);
		
		List ss4 = new ArrayList<School>();
		ss4.add(s13);
		ss4.add(s14);
		ss4.add(s15);
		ss4.add(s16);
		
		school = new HashMap<Province, List<School>>();
		school.put(p1, ss1);
		school.put(p2, ss2);
		school.put(p3, ss3);
		school.put(p4, ss4);
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public List<Province> getProvince() {
		return province;
	}

	public void setProvince(List<Province> province) {
		this.province = province;
	}

	public Map<Province, List<School>> getSchool() {
		return school;
	}

	public void setSchool(Map<Province, List<School>> school) {
		this.school = school;
	}

}
