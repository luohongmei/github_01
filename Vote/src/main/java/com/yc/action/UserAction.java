package com.yc.action;



import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yc.biz.UserBiz;
import com.yc.biz.VoteBiz;
import com.yc.po.SubjectBean;
import com.yc.po.User;
@Controller("userAction")
public class UserAction  implements SessionAware{
	private User user;
    @Autowired
    private UserBiz biz;
    @Autowired
    private VoteBiz biz1;
    private Map<String,Object> session;
    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
    public  UserAction(){ 
    	biz=new UserBiz();
    	biz1=new VoteBiz();
    	System.out.println("我是登录发出的请求");
    }
    public String register(){
    	if(biz.register(user)==1){
    		return "success";
    	}
    	return "fail";
    }
	public String login(){
		User user1=biz.login(user);
		if(user1==null){
			session.put("errorLogin", "用户名或者密码不存在");
		}
		session.put("user", user1);
		List<SubjectBean> sub=biz1.getSubject();
		session.put("subjectBean",sub);
		System.out.println("我是登录的方法");
		return "login";
	} 
	
	@Override
	public void setSession(Map<String, Object>  session) {
		this.session=session;
	}
	
}
