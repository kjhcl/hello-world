package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	@ResponseBody
	public String homePage(){
		return "Working";
	}
	
	
	@RequestMapping("test")
	@ResponseBody
	public String test(){
		return "Working";
	}
}
