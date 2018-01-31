package com.yaxin.start.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaxin.start.pojo.User;
import com.yaxin.start.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@RequestMapping(value="/getList")
	public List<User> getList(User user){
		logger.info("jinlai==============userController");
		
		return userService.getList(user);
		
	}
}
