package com.sun.utils.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.utils.code.mapper.CodeMapper;
import com.sun.utils.code.model.CodeModel;
import com.sun.utils.code.service.CodeService;

@Service
public class CodeServiceImpl implements CodeService {
	@Autowired
	private CodeMapper codeMapper;

	@Override
	public List<CodeModel> queryAll() {
		return codeMapper.queryAll();
	}
	
}
