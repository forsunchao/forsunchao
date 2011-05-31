package com.chinasoft.sms.login.service;

import com.chinasoft.sms.check.pojo.Basicinfo;

/**
 * 
 * @author Jian.Yao
 * 
 */
public interface LoginService {

	public Basicinfo userLogin(String logName,String logPwd);
}
