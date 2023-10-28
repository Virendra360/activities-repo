package com.npci.NewLoanApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.NewLoanApp.beans.CreditScore;

public interface CreditScoreDao extends JpaRepository<CreditScore, String> {

}
