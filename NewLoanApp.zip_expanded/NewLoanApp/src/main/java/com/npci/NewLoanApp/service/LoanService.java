package com.npci.NewLoanApp.service;

import java.util.List;

import com.npci.NewLoanApp.beans.Loan;
import com.npci.NewLoanApp.beans.LoanAplication;

public interface LoanService {
    
	public List<Loan> getLoans();
    public List<LoanAplication> getLoanAplications();
    public Loan getLoan(int loanId);
    public LoanAplication getLoanAplication(int applicationId);
    public int getcreditScore(String pan);
}
