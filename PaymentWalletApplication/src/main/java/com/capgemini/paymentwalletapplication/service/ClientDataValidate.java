package com.capgemini.paymentwalletapplication.service;

public class ClientDataValidate {
	public boolean validateGender(String gender) {
		if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female"))
			return true;
		else
			return false;
	}
	
	public boolean validatePhoneNumber(String phoneNumber) {
		if(phoneNumber.length()==10)
			return true;
		else
			return false;
	}
	
	public boolean validateEmail(String email) {
		if(email.endsWith("@capgemini.com")||email.endsWith("@gmail.com"))
			return true;
		else
			return false;
	}
	
	public boolean validatePassword(String password) {
		if((password.length()>=6)&&((password.contentEquals("@")||password.contentEquals("#")||password.contentEquals("$"))))
			return true;
		else
			return false;
	}
}
