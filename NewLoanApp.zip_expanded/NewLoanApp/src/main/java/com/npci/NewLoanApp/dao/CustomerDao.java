package com.npci.NewLoanApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.NewLoanApp.beans.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
    
	// custom query to find by email id
	Customer findByCustomerEmailId(String emailiId);
	// custom query to find by pan
		Customer findByCustomerPan(String pan);
}
