package com.yc.mapper;

import com.yc.po.User;

public interface UserMapper {
   User getUser(User user);
   int register(User user);
}
