package com.yc.biz;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.yc.mapper.UserMapper;
import com.yc.po.User;
@Service("userBiz")
public class UserBiz {
	@Autowired
	private UserMapper mapper;
	
    public int register(User user){
	   return mapper.register(user);
    }
    public User login(User user){
    	return mapper.getUser(user);
    }
}
