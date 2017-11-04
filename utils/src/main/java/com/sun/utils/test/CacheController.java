package com.sun.utils.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.utils.util.RedisUtils;


@RestController
@RequestMapping("/caches")
public class CacheController {

	@Autowired
	private RedisUtils redisUtils;

	@RequestMapping("/test")
	public String test() {
		redisUtils.set("123", "hello world");
		System.out.println("进入了方法");
		String string = redisUtils.get("123").toString();
		return string;
	}

}
