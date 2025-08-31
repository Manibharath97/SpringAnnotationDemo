package com.codesnippet.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	@RequestMapping(path = "/getEmp", method = RequestMethod.GET)
	@ResponseBody
	public String getEmployee(){
		return "employee";
	}

}
