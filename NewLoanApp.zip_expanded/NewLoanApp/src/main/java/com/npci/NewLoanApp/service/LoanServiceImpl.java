package com.npci.NewLoanApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.NewLoanApp.beans.CreditScore;
import com.npci.NewLoanApp.beans.Customer;
import com.npci.NewLoanApp.beans.Loan;
import com.npci.NewLoanApp.beans.LoanAplication;
import com.npci.NewLoanApp.dao.CreditScoreDao;
import com.npci.NewLoanApp.dao.CustomerDao;
import com.npci.NewLoanApp.dao.LoanApplicationDao;
import com.npci.NewLoanApp.dao.LoanDao;

@Service("loanService")
public class LoanServiceImpl implements LoanService {
  @Autowired
	private LoanDao loanDao;
  @Autowired
  private LoanApplicationDao loanAplicationDao;
  @Autowired 
  private CreditScoreDao creditScoreDao;
  
	@Override
	public List<Loan> getLoans() {
	
		return loanDao.findAll();
	}

	@Override
	public List<LoanAplication> getLoanAplications() {
		
		return loanAplicationDao.findAll();
	}

	@Override
	public Loan getLoan(int loanID) {
		
		return loanDao.findById(loanID).orElseThrow();
	}

	@Override
	public LoanAplication getLoanAplication(int applicationId) {
		
		return loanAplicationDao.findById(applicationId).orElseThrow();
	}

	@Override
	public int getcreditScore(String pan) {
		CreditScore creditdetails=creditScoreDao.findById(pan).orElseThrow();
		int score=creditdetails.getScore();
		return score;
	}

	

}
