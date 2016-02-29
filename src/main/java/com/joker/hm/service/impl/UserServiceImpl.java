package com.joker.hm.service.impl;

import javax.annotation.Resource;

import com.joker.hm.dao.IUserDao;
import com.joker.hm.pojo.User;
import com.joker.hm.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		return null;
	}
}
