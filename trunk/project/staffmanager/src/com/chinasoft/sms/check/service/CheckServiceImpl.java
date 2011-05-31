package com.chinasoft.sms.check.service;

import java.util.List;

import com.chinasoft.sms.check.dao.ICheckDao;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;

public class CheckServiceImpl implements ICheckService {

	public List<Object[]> queryFlowinfoBystaffNub(String staffNub) {
		return checkDao.queryFlowinfoBystaffNub(staffNub);
	}

private ICheckDao  checkDao;
  
	public ICheckDao getCheckDao() {
	return checkDao;
}

public void setCheckDao(ICheckDao checkDao) {
	this.checkDao = checkDao;
}

	public List<Basicinfo> queryACheckedByState(String state) {
		return checkDao.queryACheckedByState(state);
	}
}
