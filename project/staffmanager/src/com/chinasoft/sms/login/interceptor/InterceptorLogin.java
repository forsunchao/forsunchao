package com.chinasoft.sms.login.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class InterceptorLogin implements Interceptor
{

	public void destroy()
	{
	// TODO Auto-generated method stub

	}

	public void init()
	{
	// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation arg0) throws Exception
	{
		
		// TODO Auto-generated method stub
		//System.out.println("执行中断器package com.chinasoft.sms.login.interceptor;99999999999999999999");
		Object obj=arg0.getInvocationContext().getSession().get("user");
		if(null==obj){
			
			return "noLogin";
		}else{
			//
		}
	    return arg0.invoke();
	}

}

