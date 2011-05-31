package com.chinasoft.sms.index.service;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.index.dao.IStaffDAO;

public  class StaffServiceImpl implements IStaffService {
	IStaffDAO dao;

	public List<String> query(Basicinfo bi) {
		return dao.query(bi);
	}

	public IStaffDAO getDao() {
		return dao;
	}

	public void setDao(IStaffDAO dao) {
		this.dao = dao;
	}

	public List<String> querystaffdate(Basicinfo bi) {
		// TODO Auto-generated method stub
		return dao.querystaffdate(bi);
		
	}

}
