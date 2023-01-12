package com.tminhat.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/Home")
	public String getPage()
	{
		return "Home";//this is the name of jsp page which will be displayed
	}
}
