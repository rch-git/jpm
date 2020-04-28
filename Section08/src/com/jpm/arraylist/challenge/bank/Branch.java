package com.jpm.arraylist.challenge.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch
{
	private String branchName;
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public Branch(String branchName, String customerName, Double amount)
	{
		super();
		this.branchName = branchName;
		ArrayList<Double> t = new ArrayList<Double>();
		t.add(amount);
		Customer c = new Customer(customerName, t);
		this.customers.add(c);
	}

	public void addNewCustomer(String name, double amount)
	{
		ArrayList<Double> transaction = new ArrayList<Double>();
		transaction.add(amount);
		
		boolean customerExists = customerExists(name);
		
		if(!customerExists)
		{
			Customer c = new Customer(name, transaction);
			this.customers.add(c);
		}
		else
		{
			System.out.println("Customer: " + name + "  exists in Branch: " + this.branchName);
		}
	}
	
	public void addNewTransaction(String customerName, double amount)
	{
		boolean customerExists = customerExists(customerName);
		
		if(customerExists)
		{
			for (int i = 0; i < this.customers.size(); i++)
			{
				if(this.customers.get(i).getName().equalsIgnoreCase(customerName))
				{
					this.customers.get(i).setTransaction(amount);
				}
			}
		}
		else
		{
			System.out.println(customerName + " is not a customer. Cannot set transaction.");
		}
	}
	
	public ArrayList<Customer> getCustomer()
	{
		return this.customers;
	}
	
	
	public String getBranchName()
	{
		return this.branchName;
	}
	
	public boolean customerExists(String name)
	{
		boolean customerExists = false;
		
		for(int i = 0; i < this.customers.size(); i++)
		{
			if(this.customers.get(i).getName().equalsIgnoreCase(name))
			{
				customerExists = true;
			}
		}
		
		return customerExists;
	}
	
	public int findCustomer(String name)
	{
		int position = -1;
		for(int i = 0; i < this.customers.size(); i++)
		{
			if(this.customers.get(i).getName().equalsIgnoreCase(name))
			{
				position = i;
			}
		}
		
		return position;
	}
}