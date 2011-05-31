package com.chinasoft.sms.admin.service;

import java.util.List;

import com.chinasoft.sms.admin.dao.UserDao;
import com.chinasoft.sms.admin.dao.UserDaoImpl;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.common.Page;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import freemarker.core.ReturnInstruction.Return;


public class UserServiceImpl implements UserService {
    private UserDao adduserdao;
	public boolean addUser(Basicinfo basicinfo) {
      adduserdao.addUser(basicinfo);
		return true;
	}
	
	
	public int queryCount(String name) {
		String hql=null;
		hql = "from Basicinfo t where name='"+name+"'";
		return adduserdao.queryCount(hql);
	}


	public UserDao getAdduserdao() {
		return adduserdao;
	}
	public void setAdduserdao(UserDao adduserdao) {
		this.adduserdao = adduserdao;
	}


	public boolean delUser(Basicinfo basicinfo) {
		adduserdao.delUser(basicinfo);
		return true;
	}


	public List<Basicinfo> query(String searchType, String conditionValue) {
		String hql = null;
		if ("0".equals(searchType)) {
			hql = "from Basicinfo where  staffNumber='" + conditionValue + "'";
		} else if ("1".equals(searchType)) {
			hql = "from Basicinfo where  name  like '%" + conditionValue + "%'";
		} else if ("2".equals(searchType)) {
			hql = "from Basicinfo b   where   b.departmentinfo.departmentName='"
					+ conditionValue + "'";
		} else if ("3".equals(searchType)) {
			hql = "from Basicinfo where  education='" + conditionValue + "'";
		} else if ("4".equals(searchType)) {
			hql = "from Basicinfo where  ismarried='" + conditionValue + "'";
		} 
		return adduserdao.queryList(hql);
		
	}
 
   
	public Basicinfo queryUser(Long staffNumber) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean updateUser(Basicinfo basicinfo) {
		adduserdao.updateUser(basicinfo);
		return true;
	}


	public List<Basicinfo> queryList(String staffNumber) {
		String hql = null;
		hql = "from Basicinfo where  staffNumber='" + staffNumber + "'";
		return adduserdao.queryList(hql);
	}


	public List<Basicinfo> queryAlList() {
		
		return adduserdao.queryList("FROM Basicinfo");
	}
	public List<Basicinfo>  queryUser(final Page page,  String name){
		return adduserdao.queryUser(page, name);
	}



	
}
