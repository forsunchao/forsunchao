package org.sunchao.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation invocation) throws Exception {
		Map session = invocation.getInvocationContext().getSession();//拿到session
		
		if(session.get("login") == null) {
			return Action.LOGIN;//如果没有session，表示用户还没有登录过，那么返回登录的结果集
		} else {
			String result = invocation.invoke();//如果有session，表示用户已经登录，那么直接执行下一步
			return result;
		}
	}
}
