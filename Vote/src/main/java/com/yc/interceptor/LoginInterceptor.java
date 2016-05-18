package com.yc.interceptor;

import java.util.Map;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * �û���¼������
 * @author LHM
 *
 */
public class LoginInterceptor implements Interceptor{
	private static final long serialVersionUID = 1L;
	@Override
	public void destroy() {
		
	}
	@Override
	public void init(){
		
	}
  	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();
		Object obj=session.get("user");
		if(obj==null){
			session.put("errorMsg", "���¼���ٽ��в���");
			return "login";
		}
		return invocation.invoke();
	}
}
