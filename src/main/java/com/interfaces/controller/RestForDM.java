package com.interfaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestForDM {
	@ResponseBody
	@RequestMapping(value = "/connetMyl",method = RequestMethod.GET)
	public String connMy(){
		String a = "2"; 
		System.out.println(a);
		System.out.println("Success1");
		System.out.println("Success2");


		return "Success";
		
	}

}
