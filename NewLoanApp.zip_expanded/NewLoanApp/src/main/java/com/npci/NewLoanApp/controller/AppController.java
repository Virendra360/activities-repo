package com.npci.NewLoanApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.NewLoanApp.beans.CreditScore;
import com.npci.NewLoanApp.beans.Customer;
import com.npci.NewLoanApp.beans.Employee;
import com.npci.NewLoanApp.beans.Loan;
import com.npci.NewLoanApp.beans.LoanAplication;
import com.npci.NewLoanApp.service.CustomerService;
import com.npci.NewLoanApp.service.EmployeeService;
import com.npci.NewLoanApp.service.LoanService;



//@CrossOrigin(origins={"*"})  //to enable all cors
@RestController 
@RequestMapping("/")
public class AppController {

	@Autowired
	private CustomerService customerService;
	@Autowired EmployeeService employeeService;
	@Autowired LoanService loanService;
	//to store exceptions 
	private List<Exception> exceptionList =new ArrayList<>();
	
//	 creating for to register a customer
   @PostMapping("/new")
   public ResponseEntity<Customer>createNewProfile(@RequestBody Customer c)
   {
	   try {
		   Customer newc=customerService.createCustomer(c);
		   return ResponseEntity.status(200).body(newc);
	   }catch(IllegalArgumentException e) {
		   exceptionList.add(e);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   } 
   }
   
   // customer login webservice
   @PostMapping("/customerLogin")
   public ResponseEntity<Customer>customerLogin(@RequestBody Customer c)
   {
	   try {
		   Customer newc=customerService.customerLogin(c.getCustomerEmailId(),c.getCustomerPassword());
		   return ResponseEntity.status(200).body(newc);
	   }catch(IllegalArgumentException e) {
		   exceptionList.add(e);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   }
   }
   
// loan officer login webservice
   @PostMapping("/employeeLogin")
   public ResponseEntity<Employee>employeeLogin(@RequestBody Employee e)
   {
	   try {
		   Employee newc=employeeService.employeelogin(e.getEmployeeEmailId(),e.getEmployeePassword());
		   return ResponseEntity.status(200).body(newc);
	   }catch(IllegalArgumentException exception) {
		   exceptionList.add(exception);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   }
   }
   
   // get credit score
   @PostMapping("/getScore")
   public ResponseEntity<Integer>getcreditScore(@RequestBody CreditScore c)
   {
	   try {
		   int score=loanService.getcreditScore(c.getPan());
		   return ResponseEntity.status(200).body(score);
	   }catch(IllegalArgumentException exception) {
		   exceptionList.add(exception);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   }
   }
   
// get all loans
   @GetMapping("/getAllLoans")
   public ResponseEntity<List<Loan>>getAllLoans()
   {
	   try {
		   List<Loan> score=loanService.getLoans();
		   return ResponseEntity.status(200).body(score);
	   }catch(IllegalArgumentException exception) {
		   exceptionList.add(exception);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   } 
   }
   
// get all loan applications
   @GetMapping("/getAllLoanApplications")
   public ResponseEntity<List<LoanAplication>>getAllLoanAplications()
   {
	   try {
		   List<LoanAplication> score=loanService.getLoanAplications();
		   return ResponseEntity.status(200).body(score);
	   }catch(IllegalArgumentException exception) {
		   exceptionList.add(exception);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   }
   }
   
// get  loan application
   @PostMapping("/getLoanApplication")
   public ResponseEntity<LoanAplication>getLoanAplication(@RequestBody LoanAplication loanaplication)
   {
	   try {
		   LoanAplication score=loanService.getLoanAplication(loanaplication.getApplicationId());
		   return ResponseEntity.status(200).body(score);
	   }catch(IllegalArgumentException exception) {
		   exceptionList.add(exception);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   }
   }
   
// get  loan application
   @PostMapping("/getLoanDetails")
   public ResponseEntity<Loan>getLoanAplication(@RequestBody Loan loan)
   {
	   try {
		   Loan score=loanService.getLoan(loan.getLoanId());
		   return ResponseEntity.status(200).body(score);
	   }catch(IllegalArgumentException exception) {
		   exceptionList.add(exception);
		   return ResponseEntity.status(404).body(null);
	   }catch(Exception err) {
		   exceptionList.add(err);
		   return ResponseEntity.status(404).body(null);
	   }
   }
   
}
