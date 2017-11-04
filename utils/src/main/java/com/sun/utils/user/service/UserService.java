package com.sun.utils.user.service;

import java.util.List;


import com.sun.utils.user.model.UserModel;

public interface UserService {
	/**
	* @Title: queryAll 
	* @Description: 查询全部
	* @param @return
	* @return List<UserModel>
	* @auther 孙岩
	* @throws
	 */
	List<UserModel> queryAll();

}
