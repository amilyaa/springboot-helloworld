package com.yaxin.start.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/index")
public class IndexController {
	private Logger log = LoggerFactory.getLogger(IndexController.class);
	  
	@RequestMapping(value="/test1")
	public String testController1(ModelMap map){
		log.info("===============test controller===start=================");
		map.addAttribute("name", "***");
		map.addAttribute("bookTitle", "月光宝盒");
		log.info("==========================end==========================");
		return "welcome";
	}
}
