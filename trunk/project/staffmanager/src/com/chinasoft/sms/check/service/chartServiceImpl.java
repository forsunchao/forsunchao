package com.chinasoft.sms.check.service;

import com.chinasoft.sms.check.dao.chartDAO;

public class chartServiceImpl implements chartService{
	chartDAO dao;
	public int queryBygrade(String result_grade) {
		// TODO Auto-generated method stub
		return dao.queryBygrade(result_grade);
	}
	public chartDAO getDao() {
		return dao;
	}
	public void setDao(chartDAO dao) {
		this.dao = dao;
	}

}
