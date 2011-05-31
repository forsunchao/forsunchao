package com.chinasoft.sms.check.service;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;

public interface ICheckService {
	public  List<Basicinfo> queryACheckedByState(String state);
	public  List<Object[]>  queryFlowinfoBystaffNub(String  staffNub);
	
}
