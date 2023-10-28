package com.npci.NewLoanApp.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	@Column(name="customer_first_name")
	private String customerFirstName;
	@Column(name="customer_last_name")
	private String customerLastName;
	@Column(name="customer_email_id")
	private String customerEmailId;
	@Column(name="customer_password")
	private String customerPassword;
	@Column(name="customer_phone")
	private long customerPhone;
	@Column(name="customer_pan")
	private String customerPan;
	
	//generate getters,setters, constructors and toString()
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerFirstName, String customerLastName, String customerEmailId,
			String customerPassword, long customerPhone, String customerPan) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmailId = customerEmailId;
		this.customerPassword = customerPassword;
		this.customerPhone = customerPhone;
		this.customerPan = customerPan;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerEmailId=" + customerEmailId + ", customerPassword=" + customerPassword
				+ ", customerPhone=" + customerPhone + ", customerPan=" + customerPan + "]";
	}
	
	

}
