package com.sun.utils.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.utils.user.model.UserModel;
import com.sun.utils.user.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String toHome(HttpServletRequest request) {
		List<UserModel> list = userService.queryAll();
		request.setAttribute("list", list);
		return "home";
	}
}
