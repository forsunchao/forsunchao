package com.chinasoft.sms.account.service;

import com.chinasoft.sms.account.dao.staffUpdateDao;
import com.chinasoft.sms.check.pojo.Basicinfo;

public class staffUpdateServiceImpl implements staffUpdateService
{ 
	staffUpdateDao dao;

	public boolean updatepassword(Basicinfo bi) {
		// TODO Auto-generated method stub
		return dao.updatepassword(bi);
	}

	public staffUpdateDao getDao() {
		return dao;
	}

	public void setDao(staffUpdateDao dao) {
		this.dao = dao;
	}

}
