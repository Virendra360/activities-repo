package com.npci.NewLoanApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.NewLoanApp.beans.Employee;
import com.npci.NewLoanApp.dao.EmployeeDao;

@Service("profileService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    
    public Employee employeelogin(String emailId,String password) 
    {
    	Employee e=employeeDao.findByEmployeeEmailId(emailId);
    	if(e==null)
    		throw new IllegalArgumentException("Inavalid email id..");
    	if(!e.getEmployeePassword().equals(password))
    	{
    		throw new IllegalArgumentException("Invalid password");
    	}
    		
    	return e;
    }
	
}
