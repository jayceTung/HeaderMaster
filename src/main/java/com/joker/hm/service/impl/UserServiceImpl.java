package com.joker.hm.service.impl;

import javax.annotation.Resource;

import com.joker.hm.dao.UserMapper;
import com.joker.hm.pojo.User;
import com.joker.hm.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userDao;

	public User getUserById(String userId) {
		return userDao.selectByPrimaryKey(userId);
	}
}
