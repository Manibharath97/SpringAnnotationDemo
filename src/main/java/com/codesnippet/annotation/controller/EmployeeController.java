package com.codesnippet.annotation.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.annotation.entity.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/getEmp")
	public String getEmployee(){
		return "employee";
	}
	
	@GetMapping("/getEmpByID")
	public String getEmployeeByID(@RequestParam Integer employeeId) {
		return "employee";
	}
	
	@GetMapping("/getEmpByPathID/{employeeId}")
	public String getEmployeeByPathID(@PathVariable Integer employeeId) {
		return "employee";
	}
	
	@PostMapping("/addEmp")
	public String addEmployee(@RequestBody Employee employee) {
		return "Employee is added";
	}
	
	@PutMapping("/updateEmp")
	public String updateEmployee(Employee employee) {
		return "Employee is updated";
	}
	
	@DeleteMapping("/deleteEmp")
	public String deleteEmployee(Employee employee) {
		return "Employee is deleted";
	}

}
