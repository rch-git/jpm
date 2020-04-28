package com.jpm.arraylist.challenge.bank.solution;

public class BankOperations
{
	public static void main(String[] args)
	{
		Bank bank = new Bank("ABC Bank");
		bank.addBranch("B1");
		bank.addCustomer("B1", "C1", 10.1);
		bank.addCustomer("B1", "C2", 10.2);
		bank.addCustomer("B1", "C3", 10.3);
		
		bank.addBranch("b2");
		bank.addCustomer("b2", "C4", 10.4);
		
		bank.addCustomerTransaction("B1", "C1", 10.6);
		
		bank.listCustomers("B1", true);
		
		Bank bank2 = new Bank("XYZ Bank");
		bank2.addBranch("b3");
		bank2.addCustomer("b3", "c4", 99.6);
		bank2.addCustomerTransaction("x1", "c4", 99.0);
		bank2.listCustomers("x1", true);
		
		bank.addBranch("b9");
		if(!bank.addCustomer("b9", "c9", 22.0))
		{
			System.out.println("Error.");
		}
		
//		Adding a branch that already exists
		if(!bank.addBranch("B1"))
		{
			System.out.println("B1 already exists.");
		}
		
//		Adding a transaction at a branch for a customer, that doesnt exist
		if(!bank.addCustomerTransaction("B1", "asdf", 99.33))
		{
			System.out.println("Customer asdf does not exist at branch.");
		}
		
//		Adding a customer that already exists
		if(!bank.addCustomer("B1", "C1", 99.00))
		{
			System.out.println("The customer already exists.");
		}
	}
}
