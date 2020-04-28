package com.jpm.arraylist.challenge.bank;

import java.util.ArrayList;

/**
 * This is the main class that will run all the banking operations. 
 * 
 * @author Ravi
 *
 */

public class BankOperations
{
	public static void main(String[] args)
	{
		Bank bank = new Bank();
		bank.createBranch("b1", "b1-c1", 55.1);
		
		ArrayList<Branch> branch = bank.getBranchList();
		bank.addCustomer("b2", "b2-c1", 99.0);
		bank.addCustomer("b1", "b1-c1", 22.0);
		bank.addCustomer("b1", "b1-c2", 44.0);
		bank.addCustomer("b1", "b1-c3", 666.0);
		bank.createBranch("b2", "b2-c1", 222.0);
		bank.addTransaction("b1", "b1-c1", 123.45);
		bank.addTransaction("b3", "b1-c1", 123.45);
		bank.addTransaction("b1", "b1-c4", 52.0);
		bank.addTransaction("b1", "b1-c2", 720.00);
		bank.addCustomer("b1", "b1-c99", 360.00);
		
		branch = bank.getBranchList();
		

		
		for (int i = 0; i < branch.size(); i++)
		{
			System.out.println("Branch name: " + branch.get(i).getBranchName());
			ArrayList<Customer> c = branch.get(i).getCustomer();
			System.out.println("Number of customers: " + c.size());
			for(int j = 0; j < c.size(); j++)
			{
				ArrayList<Double> transaction = c.get(j).getTransaction();
				System.out.println("\tCustomer name: " + branch.get(i).getCustomer().get(j).getName());
				for (int k = 0; k < transaction.size(); k++)
				{
					System.out.println("\t\tTransactions: " + transaction.get(k));
				}
			}
		}
	}
}
