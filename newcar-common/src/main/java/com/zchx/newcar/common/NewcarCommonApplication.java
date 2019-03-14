package com.zchx.newcar.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NewcarCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewcarCommonApplication.class, args);
	}

}
