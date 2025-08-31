package com.codesnippet.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	public String getEmployee() {
		return "employee";
	}
}
