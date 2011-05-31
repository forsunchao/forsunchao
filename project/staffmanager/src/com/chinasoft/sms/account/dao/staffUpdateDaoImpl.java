package com.chinasoft.sms.account.dao;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.chinasoft.sms.check.pojo.Basicinfo;
import com.opensymphony.xwork2.ActionContext;

public class staffUpdateDaoImpl extends HibernateDaoSupport implements staffUpdateDao
{

	public boolean updatepassword(Basicinfo bi) 
	{
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx
		.get(ServletActionContext.HTTP_REQUEST);
		String oldPassword=request.getParameter("oldPassword");
		String confirmPassword=request.getParameter("confirmPassword");
		String newPassword=request.getParameter("newPassword");

				
				if(oldPassword.equals(bi.getPassword()))
				{
					if(confirmPassword.equals(newPassword))
					{
						
						this.getHibernateTemplate().bulkUpdate("update Basicinfo set password='"+confirmPassword+"' where  staffNumber='"+bi.getStaffNumber()+"'");

					return true;
					}
	
				}
				else
				{
					return false;
				} 
				
return false;
	

	
	}
	
}


