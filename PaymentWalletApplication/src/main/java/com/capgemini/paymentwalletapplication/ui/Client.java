package com.capgemini.paymentwalletapplication.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.capgemini.paymentwalletapplication.service.ClientDataValidate;
import com.capgemini.paymentwalletapplication.service.ClientService;

public class Client {

	public static void main(String[] args) {
		
int choice = 0;
		
		do {
			
	System.out.println("*******************Welcome to PAYMENT WALLET APPLICATION******************");
	System.out.println("SELECT ONE OF THE FOLLOWING OPTIONS TO PROCEED:");
	System.out.println("1.Create Account \n");
	System.out.println("2.Show Balance \n");
	System.out.println("3.Deposit \n");
	System.out.println("4.withdraw \n");
	System.out.println("5.Fund Transfer \n");
	System.out.println("6.Print Transactions \n");
	try {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("enter your choice:");
		choice=Integer.parseInt(br.readLine());
		//long accNo=0;
		
		
		switch(choice)
		{
		case(1):
		{
			createAccount();
		break;
		}
		
		case(2):
		{
			showBalance();

			break;
		}
		case(3):
		{
			deposit();
			break;
		}
		case(4):
		{
			withdraw();
			break;
		}
		case(5):
		{
			fundTransfer();
			break;
		}
		case(6):
		{
			printTransaction();
			break;
		}
		
		default:
		{
			System.out.println("choose proper option");
			break;
		}
	}
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
		

	}
		while(choice != 6);
	}
	
	
	public static void createAccount() {
		
	}
	
public static void showBalance() {
		
	}
public static void deposit() {
	
}
public static void withdraw() {
	
}
public static void fundTransfer() {
	
}
public static void printTransaction() {
	
}

}
