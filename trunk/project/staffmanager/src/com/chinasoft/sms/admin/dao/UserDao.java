package com.chinasoft.sms.admin.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.common.Page;



public interface UserDao {
	public boolean addUser(Basicinfo basicinfo);
	public boolean delUser(Basicinfo basicinfo);
	public boolean updateUser(Basicinfo basicinfo);
	public List<Basicinfo> queryList(String hql);
	public Basicinfo queryUser(Long staffNumber);
    public int queryCount(String hql);
	public List<Basicinfo>  queryUser(final Page page,  String name);
}
