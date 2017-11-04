package com.sun.utils.code.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sun.utils.code.model.CodeModel;

@Mapper
public interface CodeMapper {

	List<CodeModel> queryAll();

}
