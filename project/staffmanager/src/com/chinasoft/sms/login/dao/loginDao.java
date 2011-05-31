package com.chinasoft.sms.login.dao;

import com.chinasoft.sms.check.pojo.Basicinfo;

/**
 * 
 * @author jian.yao date 2010-09-18 用户登录验证
 */
public interface  loginDao 
{
	public Basicinfo loginvalidate(String logName,String logPwd);

	
}
