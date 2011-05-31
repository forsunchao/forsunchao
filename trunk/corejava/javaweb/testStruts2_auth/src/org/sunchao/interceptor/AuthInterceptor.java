package org.sunchao.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation invocation) throws Exception {
		Map session = invocation.getInvocationContext().getSession();//�õ�session
		
		if(session.get("login") == null) {
			return Action.LOGIN;//���û��session����ʾ�û���û�е�¼������ô���ص�¼�Ľ����
		} else {
			String result = invocation.invoke();//�����session����ʾ�û��Ѿ���¼����ôֱ��ִ����һ��
			return result;
		}
	}
}
