package com.jpm.challenge;

import java.util.Scanner;

public class MainBankAccount
{
	public static void main(String[] args)
	{
		MainBankAccount mba = new MainBankAccount();
		
		mba.UseDefaultConstructor();
		mba.UseExplicitConstructor();
	}
	
	public void UseExplicitConstructor()
	{
		System.out.println("Using explicit constructor");
		BankAccount ba = new BankAccount(123456, "Test", "test@test.com", 1234567890);
		
		PrintMemberVariables(ba);
	}
	
	public void UseDefaultConstructor()
	{
		System.out.println("Using default constructor.");
		BankAccount ba = new BankAccount();
		PrintMemberVariables(ba);
	}
	
	public void PrintMemberVariables(BankAccount ba)
	{
		System.out.println("Account number: " + ba.getAccountNumber());
		System.out.println("Account name: " + ba.getCustomerName());
		System.out.println("Email: " + ba.getEmail());
		System.out.println("Phone number: " + ba.getPhoneNumber());
		System.out.println("Balance: " + ba.getBalance() + "\n");
	}
	
	public void EnterBankAccountDetails()
	{	
		BankAccount[] ba = new BankAccount[1];
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 for (int i = 0; i < ba.length; i++)
		 {
			 ba[i] = new BankAccount(); 
			 
			 System.out.println("Enter Name: ");
			 ba[i].setCustomerName(scanner.next());
			 
			 scanner.nextLine();
			 
			 System.out.println("Enter email: ");
			 ba[i].setEmail(scanner.next());
			 
			 scanner.nextLine();
			 
			 System.out.println("Enter phone number: ");
			 ba[i].setPhoneNumber(scanner.nextInt());
		 }

		 for (int i = 0; i < ba.length; i++)
		 {
			 System.out.println("Account number: " + ba[i].getAccountNumber());
			 System.out.println("Customer name: " + ba[i].getCustomerName());
			 System.out.println("Email: " + ba[i].getEmail());
			 System.out.println("Phone number: " + ba[i].getPhoneNumber());
			 System.out.println("Balance: $" + ba[i].getBalance());
		 }
		 
		 System.out.println("Test deposit and withdraw.");
		 
		 for (int i = 0; i < ba.length; i++)
		 {
			 System.out.println("Enter the amount to deposit: ");
			 ba[i].deposit(scanner.nextDouble());
			 
			 scanner.nextLine();
			 
			 System.out.println("Enter the amount to withdraw: ");
			 ba[i].withdraw(scanner.nextDouble());
		 }
		 
		 scanner.close();
	}
}