package com.jpm.section08.linkedlist;

public class Customer
{
	private String name;
	private double balance;
	

	public String getName()
	{
		return name;
	}


	public double getBalance()
	{
		return balance;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	

	public Customer(String name, double balance)
	{
		super();
		this.name = name;
		this.balance = balance;
	}
}
