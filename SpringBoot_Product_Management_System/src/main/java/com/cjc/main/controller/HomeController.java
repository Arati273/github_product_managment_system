package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.main.service.HomeService;

@Controller
public class HomeController {
	 @Autowired
	 HomeService hs;
	
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}

	@RequestMapping("/adminview")
	public String preadminview()
	{
		return "addproduct";
	}

	@RequestMapping("/adminview")
	public String preadminview1()
	{
		return "viewproduct";
	}

	
}
