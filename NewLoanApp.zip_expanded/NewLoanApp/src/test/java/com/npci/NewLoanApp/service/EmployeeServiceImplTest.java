package com.npci.NewLoanApp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.npci.NewLoanApp.beans.Employee;

@SpringBootTest
class EmployeeServiceImplTest {
   @Autowired
	private EmployeeService employeeService;
	@Test
	void employeeLoginTest() {
		 try {
			 Employee e=employeeService.employeelogin("2email@gmail.com", "Password2");
			 System.out.println("___________");
			 System.out.println(e);
			 System.out.println("___________");
		 }
		 catch(IllegalArgumentException e){
			 System.out.println("___________");
			 System.out.println(e);
			 System.out.println("___________");
		 }
		 
	}

}
