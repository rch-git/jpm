package com.jpm.arraylist.challenge.bank;

import java.util.ArrayList;


public class Bank
{
	private ArrayList<Branch> branches = new ArrayList<Branch>();
	
	public ArrayList<Branch> getBranchList()
	{
		return this.branches;
	}
	
	public void createBranch(String branchNane, String customerName, double amount)
	{
		Branch b = new Branch(branchNane, customerName, amount);
		this.branches.add(b);
	}
	
	public void addCustomer(String branchName, String customerName, double amount)
	{
		boolean branchExists = branchExists(branchName);
		
		if(branchExists)
		{
			for(int i = 0; i < this.branches.size(); i++)
			{
				if(this.branches.get(i).getBranchName().equalsIgnoreCase(branchName))
				{
					this.branches.get(i).addNewCustomer(customerName, 99.33);
				}
			}
		}
		else
		{
			System.out.println("Branch: " + branchName + " does not exist");
		}
	}
	
	public void addTransaction(String branchName, String customerName, double amount)
	{
		int position = findBranch(branchName);
		
		if(position >= 0)
		{
			this.branches.get(position).addNewTransaction(customerName, amount);
		}
		else
		{
			System.out.println("Branch: " + branchName + " does not exist. Invalid transaction : " + amount);
		}
	}
	
	private boolean branchExists(String branchName)
	{
		boolean branchExists = false;
		
		for (int i = 0; i < this.branches.size(); i++)
		{	
			if(this.branches.get(i).getBranchName().equalsIgnoreCase(branchName))
			{
				branchExists = true;
			}
		}
		
		return branchExists;
	}
	
	private int findBranch(String branchName)
	{
		int position = -1;
		
		for(int i = 0; i < this.branches.size(); i++)
		{
			if(this.branches.get(i).getBranchName().equalsIgnoreCase(branchName))
			{
				position = i;
			}
		}
		
		return position;
	}
	
}
