package com.chinasoft.sms.electionicdoc.service;

import java.sql.Date;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;
import com.chinasoft.sms.electionicdoc.dao.UserDAO;

public class UserServiceImpl implements UserService
{
	private UserDAO userDAO;
	private Basicinfo basicinfo;
	private Dynamicinfo dynamicinfo;

	public void add(Basicinfo basicinfo)
	{
		userDAO.add(basicinfo);
	}

	public void delete(Basicinfo basicinfo)
	{
		userDAO.delete(basicinfo);
	}

	public void update(Basicinfo basicinfo)
	{
		userDAO.update(basicinfo);
	}

	public List<Basicinfo> query(String searchType, String conditionValue)
	{
		return userDAO.query(searchType, conditionValue);
	}

	public int queryCountByMarried(String ismarried)
	{
		return userDAO.queryCountByMarried(ismarried);
	}

	public int queryCountBySex(String sex)
	{
		return userDAO.queryCountBySex(sex);
	}

	public UserDAO getUserDAO()
	{
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO)
	{
		this.userDAO = userDAO;
	}

	public Basicinfo getBasicinfo()
	{
		return basicinfo;
	}

	public void setBasicinfo(Basicinfo basicinfo)
	{
		this.basicinfo = basicinfo;
	}

	public Dynamicinfo getDynamicinfo()
	{
		return dynamicinfo;
	}

	public void setDynamicinfo(Dynamicinfo dynamicinfo)
	{
		this.dynamicinfo = dynamicinfo;
	}

	public int queryCountByEducation(String education)
	{
		return userDAO.queryCountByEducation(education);
	}

	public List<String> querystaffdate(Basicinfo bi)
	{
		// TODO Auto-generated method stub
		return userDAO.querystaffdate(bi);
	}

	public Basicinfo queryBasicinfoById(Long staffNumber)
    {
	    return userDAO.queryBasicinfoById(staffNumber);
    }
}
