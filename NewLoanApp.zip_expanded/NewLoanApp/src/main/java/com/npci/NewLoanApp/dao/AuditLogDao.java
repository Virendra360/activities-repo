package com.npci.NewLoanApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.NewLoanApp.beans.AuditLog;

public interface AuditLogDao extends JpaRepository<AuditLog, Integer> {

}
