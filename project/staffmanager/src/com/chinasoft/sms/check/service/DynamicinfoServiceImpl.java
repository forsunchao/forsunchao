package com.chinasoft.sms.check.service;


import java.util.List;

import com.chinasoft.sms.check.dao.IDynamicinfoDAO;

import com.chinasoft.sms.check.pojo.Dynamicinfo;

public class DynamicinfoServiceImpl  implements IDynamicinfoService
{
	  Dynamicinfo dyi;
	  IDynamicinfoDAO  dynamicDAO;

	public boolean generalPaper(Dynamicinfo dyi) 
	{
		dynamicDAO.insertLibrarypaper(dyi);
		return true;
	}
    public List<Dynamicinfo> getPaper(long dyid)
    {
    	return dynamicDAO.querycheckpaper(dyid);
    }
	public Dynamicinfo getDyi() {
		return dyi;
	}

	public void setDyi(Dynamicinfo dyi) {
		this.dyi = dyi;
	}

	public IDynamicinfoDAO getDynamicDAO() {
		return dynamicDAO;
	}

	public void setDynamicDAO(IDynamicinfoDAO dynamicDAO) {
		this.dynamicDAO = dynamicDAO;
	}




}
