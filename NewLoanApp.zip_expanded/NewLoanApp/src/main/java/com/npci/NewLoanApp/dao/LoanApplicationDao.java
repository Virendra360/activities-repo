package com.npci.NewLoanApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.NewLoanApp.beans.LoanAplication;



public interface LoanApplicationDao extends JpaRepository<LoanAplication, Integer> {

	// customer query to fetch loan application based on customerId
	LoanAplication findByCustomerId(int customerId);
	
}
