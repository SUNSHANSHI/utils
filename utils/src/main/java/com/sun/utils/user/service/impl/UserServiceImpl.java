package com.sun.utils.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.utils.model.UserModel;
import com.sun.utils.user.mapper.UserMapper;

import com.sun.utils.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserModel> queryAll() {
		return userMapper.queryAll();
	}

}
