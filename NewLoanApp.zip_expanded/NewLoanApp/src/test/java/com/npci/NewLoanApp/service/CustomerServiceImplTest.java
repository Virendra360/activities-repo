package com.npci.NewLoanApp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.npci.NewLoanApp.beans.Customer;
import com.npci.NewLoanApp.exception_store.CustomerNotFoundException;

@SpringBootTest
public class CustomerServiceImplTest {
      @Autowired
	private CustomerService customerService;
	
	@Test
	 void createCustomerTest()
	{
	   Customer c=new Customer(0,"sarthak","Jagtap","mgjiru@gmail.com","Nandan12@",7517053943L,"BSNP234");
	   System.out.println("___________");
	   System.out.println("Before adding");
	   System.out.println(c);
	   Customer newc=customerService.createCustomer(c);
	   
	   
	   System.out.println("After adding");
	   System.out.println(newc);
	   System.out.println("___________"); 
	}
	@Test
	void findProfileTest()
	{
		  try {
			Customer c=customerService.findProfile(12);
			 System.out.println("___________");
			 System.out.println(c);
			 System.out.println("___________");
		} catch (CustomerNotFoundException e) {
			 System.out.println("___________");
			System.out.println(e);
			 System.out.println("___________");
		}
		  
	}
	
	@Test
	void findProfileByEmailIdTest()
	{
			Customer c;
			try {
				c = customerService.findProfileByEmailId("mgjiru@gmail.com");
				System.out.println("___________");
				System.out.println(c);
				System.out.println("___________");
				
			} catch (CustomerNotFoundException e) {
				 System.out.println("___________");
				 System.out.println(e);
				 System.out.println("___________");
			}
	}
	
	@Test
	void customerLoginTest()
	{
			Customer c;
			try {
				c = customerService.customerLogin("mgjiru@gmail.com","Nandan12@");
				System.out.println("___________");
				System.out.println(c);
				System.out.println("___________");
				
			} catch (IllegalArgumentException e) {
				 System.out.println("___________");
				 System.out.println(e);
				 System.out.println("___________");
			}
	}
	
	
}
