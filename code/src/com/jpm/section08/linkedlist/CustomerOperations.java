package com.jpm.section08.linkedlist;

import java.util.ArrayList;

public class CustomerOperations
{

	public static void main(String[] args)
	{
		Customer customer = new Customer("c1", 99.66);
		Customer anotherCustomer;
		anotherCustomer = customer;

		anotherCustomer.setBalance(55.00);
		System.out.println("Balance for customer: " + customer.getName() + " is: " + customer.getBalance());
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(3);
		intList.add(4);
		
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println(i + ": " + intList.get(i));
		}
		
		intList.add(1, 2);
		
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println(i + ": " + intList.get(i));
		}
		
	}

}
