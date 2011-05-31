package com.chinasoft.sms.index.service;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;

public interface IStaffService {
	public List<String> query(Basicinfo bi);
    public List<String> querystaffdate(Basicinfo bi);
}
