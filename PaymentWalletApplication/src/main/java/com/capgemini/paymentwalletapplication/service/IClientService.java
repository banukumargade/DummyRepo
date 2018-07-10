package com.capgemini.paymentwalletapplication.service;

import com.capgemini.paymentwalletapplication.ui.Client;

public interface IClientService {

	public int createAccount(Client ClientDetails);
	
	public int showBalance();
	
	public int deposit(double amount);
	
	public int withdraw(double amount);
	
	public int fundTransfer(long accNo,double amount);
	
	public int printTransaction(double transactionId);
	
	
}
