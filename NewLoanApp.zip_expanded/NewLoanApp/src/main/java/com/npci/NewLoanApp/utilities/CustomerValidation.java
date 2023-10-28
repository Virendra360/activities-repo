package com.npci.NewLoanApp.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidation {
    
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private long phone;
	
	// generate constructors
	public CustomerValidation() {
		super();
	}
	public CustomerValidation(String firstName, String lastName, String emailId, String password, long phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.phone = phone;
	}
	
	// define methods to validate fields
	// minimum 3 char
	public boolean validateFirstName(String firstName) {
		 if (firstName == null || firstName.length() < 4) {
             return false;
         }
   	  return true;
	}
	// minimum 1 char
	public boolean validateLastName(String lastName){
		 if (lastName == null || lastName.length() < 2) {
             return false;
         }
   	  return true;
	}
	// validate email_id : Valid email-id must have @, .(dot) mandatory
    public boolean validateEmailId(String emailId)
    {
   	// Regular expression for a valid email address
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
	// minimum 8 chars 
    public boolean validatePassword(String password){
    	 if (password.length() < 9) {
             return false;
         }
         // Use regular expressions to check for uppercase, lowercase, digit, and special symbol
         String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).*$";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(password);

          return matcher.matches();
    }
    // 10 digits
    public boolean validatePhone(long phone) {
    	 String myString = Long.toString(phone);
      	 Pattern pattern = Pattern.compile("\\d{10}");
          Matcher matcher = pattern.matcher(myString);
          return matcher.matches();
    }
    
}
