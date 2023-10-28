package com.npci.NewLoanApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.NewLoanApp.beans.LoginLog;

public interface LoginLogDao extends JpaRepository<LoginLog, Integer> {

}
