package com.sun.utils;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sun.utils.*.mapper")
public class UtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilsApplication.class, args);
	}
}
