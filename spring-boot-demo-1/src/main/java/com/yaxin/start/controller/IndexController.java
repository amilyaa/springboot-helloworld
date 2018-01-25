package com.yaxin.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/index")
public class IndexController {
	
	@RequestMapping(value="/test1")
	public String testController1(){
		return "hello world!!!";
	}
}
