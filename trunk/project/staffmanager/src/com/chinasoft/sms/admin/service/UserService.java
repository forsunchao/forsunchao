package com.chinasoft.sms.admin.service;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.common.Page;



public interface UserService {
	public boolean addUser(Basicinfo basicinfo);
	public boolean delUser(Basicinfo basicinfo);
	public boolean updateUser(Basicinfo basicinfo);
	public List<Basicinfo> query(String searchType, String conditionValue);
	public List<Basicinfo> queryList(String staffNumber);
	public List<Basicinfo> queryAlList();
	public Basicinfo queryUser(Long staffNumber);
	public int queryCount(String name);
	public List<Basicinfo>  queryUser(final Page page,  String name);
}
