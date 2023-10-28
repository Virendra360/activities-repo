package com.npci.NewLoanApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.NewLoanApp.beans.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	// custom query to find employee by email id
	Employee findByEmployeeEmailId(String emailId);

}
