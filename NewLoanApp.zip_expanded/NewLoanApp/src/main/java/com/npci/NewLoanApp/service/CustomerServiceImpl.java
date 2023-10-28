package com.npci.NewLoanApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.NewLoanApp.beans.Customer;
import com.npci.NewLoanApp.dao.CustomerDao;
import com.npci.NewLoanApp.exception_store.CustomerNotFoundException;
import com.npci.NewLoanApp.utilities.CustomerValidation;

import jakarta.transaction.Transactional;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public Customer createCustomer(Customer c) {
		  CustomerValidation validate= new CustomerValidation();
		 
		 if(validate.validateFirstName(c.getCustomerFirstName()))
		 {
			 if(validate.validateLastName(c.getCustomerLastName())) 
			 {
				if(validate.validateEmailId(c.getCustomerEmailId())) {
					if(validate.validatePassword(c.getCustomerPassword())) {
						if(validate.validatePhone(c.getCustomerPhone())) {
	//     after checking all validations save the customer			
							return customerDao.save(c);
						}
						else{
							throw new IllegalArgumentException("phone no must have 10 digits.");
						}
					}
					else {
						throw new IllegalArgumentException("Invalid Password format.");
					}
				}
				else {
					throw new IllegalArgumentException("Invalid Email id format.");
				}
			 }
			 else{
				 throw new IllegalArgumentException("Last Name must have atleast 1 characters");
			 }	
		 }
		 else {
			 throw new IllegalArgumentException("First Name must have atleast 3 characters");
		 }
		
		
	}
	
	@Override
	public Customer findProfile(int customerId) throws CustomerNotFoundException {
		Optional<Customer> newc=customerDao.findById(customerId);
		if(newc.isEmpty())
			throw new CustomerNotFoundException("Customer Not found..");
		return newc.orElseThrow();
	}

	@Override
	public Customer findProfileByEmailId(String emailId) throws CustomerNotFoundException {
		Customer c=customerDao.findByCustomerEmailId(emailId);
		if(c==null)
			throw new CustomerNotFoundException("Customer Not found..");
		return c;
	}

	@Override
	public List<Customer> findAllCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer customerLogin(String emailId, String password) {
		Customer c=customerDao.findByCustomerEmailId(emailId);
		if(c==null)
			throw new IllegalArgumentException("Invalid Email id  ..");
		if(!c.getCustomerPassword().equals(password))
			throw new IllegalArgumentException("Invalid password .."); 
		return c;
	}

}
