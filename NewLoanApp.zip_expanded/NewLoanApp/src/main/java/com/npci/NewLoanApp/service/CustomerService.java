package com.npci.NewLoanApp.service;

import java.util.List;
import java.util.Optional;

import com.npci.NewLoanApp.beans.Customer;
import com.npci.NewLoanApp.exception_store.CustomerNotFoundException;

public interface CustomerService {

	// define methods Customer service will have
	public Customer findProfile(int customerId) throws CustomerNotFoundException;
	public Customer findProfileByEmailId(String emailId) throws CustomerNotFoundException;
	public Customer createCustomer(Customer c) ;
	public List<Customer> findAllCustomers();
	// login method
	public Customer customerLogin(String emailId,String password);
	
}
