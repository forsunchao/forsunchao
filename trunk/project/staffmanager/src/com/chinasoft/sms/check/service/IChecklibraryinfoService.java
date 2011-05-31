package com.chinasoft.sms.check.service;

import java.util.List;

import com.chinasoft.sms.check.pojo.Checkflowinfo;
import com.chinasoft.sms.check.pojo.Checkparticularresultinfo;
import com.chinasoft.sms.check.pojo.Checktableinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checklibraryinfo;

public interface IChecklibraryinfoService {
	public boolean addChecklibraryinfo(long id, String content);

	public boolean updateCheckLibrayinfo(long id, String content);

	public boolean delectChecklibraryinfo(long id, String content);

	public List<Checklibraryinfo> findAll();

	public boolean findCheckLibrayinfo(long id, String content);

	public List<Basicinfo> queryACheckedByState(String state);

	public boolean deleteCheckLibraryinfo(long id);
	
    public  List<Checklibraryinfo> queryChecked(Long checklibrary_id,String checklibrary_content);
	
	public List<Dynamicinfo> queryCheckContByNub(Long nub);
	
	public boolean isCheck(String username);
	
	//public boolean vaildb(String commitname,String accepter);
	
	public boolean insertCheck(Checktableinfo checktableinfo,Checkflowinfo checkflowinfo);
	
	public List<Basicinfo>  viewCheck(String username,String state,String step);
	
	public boolean updateCheck(String commitname,String beizhu,String username,long totalscore);
	
	//public List<Checkparticularresultinfo> checkresult();
	public   List<Checkflowinfo> checkresult();
	
	public List<Checkflowinfo> personstep(String username);
	
	public List<Checkflowinfo> checkstep();
	
	public boolean updateCheckto(String commitname,String beizhu,String username,long totalscore);
}
