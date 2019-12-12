package com.jpm.challenge;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BankAccount
{
	private int accountNumber = setAccountNumber();
	private double balance = setBalance();
	private String customerName;
	private String email;
	private long phoneNumber;
	
	public BankAccount(int acno, String cName, String cEmail, long cPhoneNumber)
	{
		this.accountNumber = acno;
		this.customerName = cName;
		this.email = cEmail;
		this.phoneNumber = cPhoneNumber;
	}
	
	public BankAccount()
	{
//		When a new bank account is created, it is created with default values
//		This is done by calling the explicit constructor with some default values
		this(000000, "John Doe", "example@example.com", 555555555);
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getEmail()
	{
		return email;
	}
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	private int setAccountNumber()
	{
		Random r = new Random();
		this.accountNumber = r.nextInt(1000_000_000);
		return accountNumber;
	}
	private double setBalance()
	{
		Random r = new Random();
		this.balance = ThreadLocalRandom.current().nextDouble(1, 100);
		return this.balance;
	}
	public void setCustomerName(String _customerName)
	{
		this.customerName = _customerName;
	}
	public void setEmail(String _email)
	{
		this.email = _email;
	}
	public void setPhoneNumber(long _phoneNumber)
	{
		this.phoneNumber = _phoneNumber;
	}
	
	public void deposit(double depositAmount)
	{
		System.out.println("Current balance = " + this.balance);
		this.balance += depositAmount;
		System.out.println("Balance after the deposit: " + this.balance);
	}
	
	public void withdraw(double withdrawAmount)
	{
		if(withdrawAmount > this.balance)
		{
			System.out.println("Insufficient balance.");
		}
		else
		{
			this.balance -= withdrawAmount;
			System.out.println("Withdraw successful. Current balance = " + this.balance);
		}
	}
}
