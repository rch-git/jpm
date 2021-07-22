package com.jpm.section08.arraylist.challenge.bank;

import java.util.ArrayList;

public class Customer
{
	private String name;
	private ArrayList<Double> transaction = new ArrayList<Double>();
	
	public String getName()
	{
		return name;
	}
	public ArrayList<Double> getTransaction()
	{
		return transaction;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTransaction(Double  transaction)
	{
		this.transaction.add(transaction);
	}
	
	public Customer(String name, ArrayList<Double> transaction)
	{
		super();
		this.name = name;
		this.transaction = transaction;
	}
}
