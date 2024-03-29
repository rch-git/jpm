package com.jpm.section08.arraylist.challenge.bank.solution;

import java.util.ArrayList;

public class Customer
{
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String name, double initialAmount)
	{
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}
	
	public void addTransaction(double amount)
	{
		this.transactions.add(amount);
	}

	public String getName()
	{
		return name;
	}

	public ArrayList<Double> getTransactions()
	{
		return transactions;
	}

//	public void setName(String name)
//	{
//		this.name = name;
//	}
//
//	public void setTransactions(ArrayList<Double> transactions)
//	{
//		this.transactions = transactions;
//	}
	
	
}
