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

	public FormAction() {// ����һ��ʡ������ӵ��ѧУ
		province = new ArrayList<Province>();
		Province p1 = new Province(1, "����ʡ");
		Province p2 = new Province(2, "������");
		Province p3 = new Province(3, "�Ϻ���");
		Province p4 = new Province(4, "�㽭ʡ");
		province.add(p1);
		province.add(p2);
		province.add(p3);
		province.add(p4);
		//����ʡ��ѧУ
		School s1 = new School(1, "�Ͼ���ѧ");
		School s2 = new School(2, "���ϴ�ѧ");
		School s3 = new School(3, "������ѧ");
		School s4 = new School(4, "�Ͼ�ũҵ��ѧ");
		//�����е�ѧУ
		School s5 = new School(5, "�廪��ѧ");
		School s6 = new School(6, "������ѧ");
		School s7 = new School(7, "����ũҵ��ѧ");
		School s8 = new School(8, "���������ѧԺ");
		//�Ϻ��е�ѧУ
		School s9 = new School(9, "������ѧ");
		School s10 = new School(10, "�Ϻ���ͨ��ѧ");
		School s11 = new School(11, "�Ϻ������ѧԺ");
		School s12 = new School(12, "�Ϻ�������ѧ");
		//�㽭ʡ��ѧУ
		School s13 = new School(13, "�㽭��ѧ");
		School s14 = new School(14, "���ڴ�ѧ");
		School s15 = new School(15, "���ݴ�ѧ");
		School s16 = new School(16, "���ݹ�ҵ��ѧ");
		
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
