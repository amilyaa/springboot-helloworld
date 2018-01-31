package com.yaxin.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.yaxin.start.pojo.User;
import com.yaxin.start.service.UserService;
/**
 * 
 * @author liruimin
 * 
 */
@SpringBootApplication
@EnableAutoConfiguration
public class SpringbootExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		SpringApplication.run(SpringbootExample.class, args);
	
	}
}
