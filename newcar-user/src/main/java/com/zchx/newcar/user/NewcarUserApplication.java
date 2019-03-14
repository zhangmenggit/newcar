package com.zchx.newcar.user;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
@EnableDubboConfiguration
//mybatis-plue 默认扫描mapper
@MapperScan("com.zchx.newcar.user.mapper")
public class NewcarUserApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(NewcarUserApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(NewcarUserApplication.class, args);
	}

}
