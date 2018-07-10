package com.capgemini.paymentwalletapplication.service;

import com.capgemini.paymentwalletapplication.dao.ClientDAO;
import com.capgemini.paymentwalletapplication.ui.Client;

public class ClientService implements IClientService{
	
	ClientDAO dao =new ClientDAO();
	
	public int createAccount(Client ClientDetails) {
		
		return dao.createAccount(ClientDetails);
	}
	
	public int showBalance() {
		
	
		return 0;
	}
	
	public int deposit(double amount) {
		
		return dao.deposit(amount);
		
	}
	
	public int withdraw(double amount) {
		
		return dao.withdraw(amount);
		
	}
	
	public int fundTransfer(long accNo,double amount) {
		
		return dao.fundTransfer(accNo, amount);
		
	}
	
	public int printTransaction(double transactionId) {
		
		return dao.printTransaction(transactionId);
		
	}

	

}
