package com.chinasoft.sms.electionicdoc.service;

import java.sql.Date;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;

public interface UserService
{
	public void add(Basicinfo basicinfo);

	public void delete(Basicinfo basicinfo);

	public void update(Basicinfo basicinfo);

	public List<Basicinfo> query(String searchType, String conditionValue);

	public List<String> querystaffdate(Basicinfo bi);

	public int queryCountByMarried(String ismarried);

	public int queryCountBySex(String sex);

	public int queryCountByEducation(String education);

	public Basicinfo queryBasicinfoById(Long staffNumber);
}
