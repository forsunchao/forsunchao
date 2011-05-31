package com.chinasoft.sms.check.service;

import java.util.List;

import com.chinasoft.sms.check.dao.ICheckLibraryinfoDAO;
import com.chinasoft.sms.check.dao.StaffCheckImpl;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;
import com.chinasoft.sms.check.pojo.Checklibraryinfo;
import com.chinasoft.sms.check.pojo.Checkparticularresultinfo;
import com.chinasoft.sms.check.pojo.Checktableinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;

public class ChecklibraryinfoService implements IChecklibraryinfoService
{
   Checklibraryinfo cli;
   private ICheckLibraryinfoDAO cliDAO;
   private StaffCheckImpl  vailDAO;
   public boolean addChecklibraryinfo(long id,String content)//�����Ϣ
   {   
	   cli.setChecklibraryId(id);
	   cli.setChecklibraryContent(content);
	   cliDAO.addCheckLibraryinfo(cli);
	   return true;
   }
   public boolean updateCheckLibrayinfo(long id,String content)
   {  
   cliDAO.updateCheckLibraryinfoByObject(id, content);
   return true;
   }
   
   public boolean delectChecklibraryinfo(long id,String content)//�����Ϣ
   {   
	   cli.setChecklibraryId(id);
	   cli.setChecklibraryContent(content);
	   cliDAO.deleteCheckLibraryinfo(id);
	   return true;
   }
   public List<Checklibraryinfo> findAll() {
	   
	   return cliDAO.getAll();
   }
   public boolean findCheckLibrayinfo(long id,String content)
   {  
   cliDAO.findByID(id);
   return true;
   }
	public List<Basicinfo> queryACheckedByState(String state) {
		return cliDAO.queryACheckedByState(state);
	}
	public boolean deleteCheckLibraryinfo(long id){
		cliDAO.deleteCheckLibraryinfo(id);
		return  true;
	}
	
    public List<Checklibraryinfo> queryChecked(Long checklibrary_id,
				String checklibrary_content) {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isCheck(String username) {
			if( vailDAO.isCheck(username) )
				return true;
			else 
				return false;
		}
public Checklibraryinfo getCli() {
	return cli;
}
public void setCli(Checklibraryinfo cli) {
	this.cli = cli;
}
public ICheckLibraryinfoDAO getCliDAO() {
	return cliDAO;
}
public void setCliDAO(ICheckLibraryinfoDAO cliDAO) {
	this.cliDAO = cliDAO;
}



public List<Dynamicinfo> queryCheckContByNub(Long nub) {
	// TODO Auto-generated method stub
	return null;

}
public void setVailDAO(StaffCheckImpl vailDAO) {
	this.vailDAO = vailDAO;
}

public boolean insertCheck(Checktableinfo checktableinfo,Checkflowinfo checkflowinfo) 
{
	vailDAO.insertCheck(checktableinfo, checkflowinfo);   
	return true;
}
public List<Basicinfo> viewCheck(String username, String state, String step) {
	return vailDAO.viewCheck(username, state,step);
}

public boolean updateCheck(String commitname,String beizhu,String username,long totalscore){
	vailDAO.updateCheck(commitname, beizhu, username,totalscore);
	return true;
}
public boolean updateCheckto(String commitname,String beizhu,String username,long totalscore){
	vailDAO.updateCheckto(commitname, beizhu,username, totalscore);
	return true;
}
//public List<Checkparticularresultinfo> checkresult() {
	//return vailDAO.checkresult();
//}
public   List<Checkflowinfo> checkresult()
{
	return vailDAO.checkresult();
}
public List<Checkflowinfo> personstep(String username) {
	return vailDAO.personstep(username);
}
public List<Checkflowinfo> checkstep() {
	
	return vailDAO.checkstep();
}
//public boolean vaildb(String commitname,String accepter) {
	
	//return vailDAO.vaildb(commitname,accepter);
//}
}

