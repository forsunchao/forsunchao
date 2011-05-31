package com.chinasoft.sms.login.service;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.login.service.LoginServiceImpl;
import com.chinasoft.sms.login.dao.loginDao;

public class LoginServiceImpl implements LoginService {
	loginDao dao;


	public loginDao getDao() {
		return dao;
	}


	public void setDao(loginDao dao) {
		this.dao = dao;
	}


	public Basicinfo userLogin(String logName, String logPwd) {
		// TODO Auto-generated method stub
//		LoginServiceImpl loginserviceimpl = null;
			//直接继承这个已经实现的类不是很好嘛？
		Basicinfo basi= dao.loginvalidate(logName, logPwd);
		if(null==basi||null==basi.getRole())
			 return null;
		else return basi;
	}

}
