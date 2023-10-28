package com.npci.NewLoanApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.npci.NewLoanApp.beans.Loan;

public interface LoanDao extends JpaRepository<Loan, Integer> {

}
