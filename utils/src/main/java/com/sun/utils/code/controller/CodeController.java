package com.sun.utils.code.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.utils.code.model.CodeModel;
import com.sun.utils.code.service.CodeService;

@Controller
public class CodeController {
	
	@Autowired
	private CodeService codeService;
	@RequestMapping("queryAll")
	public String codeList(HttpServletRequest request) {
		List<CodeModel> codeList = codeService.queryAll();
		request.setAttribute("list", codeList);
		return "code/codeList";
	}
}
