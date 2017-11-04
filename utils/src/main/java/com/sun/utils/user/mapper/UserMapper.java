package com.sun.utils.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sun.utils.user.model.UserModel;

@Mapper
public interface UserMapper {
	
	List<UserModel> queryAll();

}
