package com.chinasoft.sms.check.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;
import com.chinasoft.sms.check.pojo.Checkparticularresultinfo;
import com.chinasoft.sms.check.pojo.Checktableinfo;


public interface IStaffCheck 
{
	public boolean isCheck(String username);
	
	public boolean insertCheck(Checktableinfo checktableinfo,Checkflowinfo checkflowinfo);
	
	public List<Basicinfo>  viewCheck(String username,String state, String step);
	
	public boolean updateCheck(String commitname,String beizhu,String username,long totalscore);
	
	//public   List<Checkparticularresultinfo> checkresult();
	public   List<Checkflowinfo> checkresult();
	
	public  List<Checkflowinfo> checkstep();
	
	public List<Checkflowinfo> personstep(String username);
	
	public boolean updateCheckto(String commitname,String beizhu,String username,long totalscore);
	
	//public boolean vaildb(String commitname,String accepter);
	
}
