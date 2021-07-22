package com.jpm.section06.challenge;

public class VipCustomer
{
	private String name;
	private double creditLimit;
	private String email;
	
	VipCustomer(String _name, double _creditLimit, String _email)
	{		
		System.out.println("Calling explicit constructor with 3 parameters.\n");
		this.creditLimit = _creditLimit;
		this.name = _name;
		this.email = _email;
	}
	
	public VipCustomer()
	{
		this("John Doe", 1234, "example@example.com");
	}
	
	public VipCustomer(double creditLimit, String email)
	{
		this("John Doe 2", creditLimit, email);
	}

	public String getName()
	{
		return name;
	}

	public double getCreaitLimit()
	{
		return creditLimit;
	}

	public String getEmail()
	{
		return email;
	}

	public void setName(String _name)
	{
		this.name = _name;
	}

	public void setCreaitLimit(double _creditLimit)
	{
		this.creditLimit = _creditLimit;
	}

	public void setEmail(String _email)
	{
		this.email = _email;
	}
}