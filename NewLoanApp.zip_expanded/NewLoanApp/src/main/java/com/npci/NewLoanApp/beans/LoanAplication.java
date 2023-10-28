package com.npci.NewLoanApp.beans;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="loan_application")
public class LoanAplication {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="appication_id")
	private int applicationId;
	
    @Column(name="customer_id")
	private int customerId;
    
	@Column(name="loan_id")
	private int loanId;
	
	@Column(name="status")
	private String status;
	
	// generate constructor,getter,setter and  toString()
	public LoanAplication() {
		super();
	}

	public LoanAplication(int applicationId, int customerId, int loanId, String status) {
		super();
		this.applicationId = applicationId;
		this.customerId = customerId;
		this.loanId = loanId;
		this.status = status;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanAplication [applicationId=" + applicationId + ", customerId=" + customerId + ", loanId=" + loanId
				+ ", status=" + status + "]";
	}
	
	
	
	
	
}
