package com.codesnippet.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.annotation.entity.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping(path = "/getEmp", method = RequestMethod.GET)
	@ResponseBody
	public String getEmployee(){
		return "employee";
	}
	
	@RequestMapping(path = "/addEmp", method = RequestMethod.POST)
	public String addEmployee(Employee employee) {
		return "Employee is added";
	}
	
	@RequestMapping(path = "/updateEmp", method = RequestMethod.PUT)
	public String updateEmployee(Employee employee) {
		return "Employee is updated";
	}
	
	@RequestMapping(path = "/deleteEmp", method = RequestMethod.DELETE)
	public String deleteEmployee(Employee employee) {
		return "Employee is deleted";
	}

}
