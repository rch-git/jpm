package com.jpm.arraylist.challenge.mobilephone.solution;

public class Contact
{
	private String name;
	private String phoneNo;
	
	
	
	public Contact(String name, String phoneNo)
	{
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public String getName()
	{
		return name;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}
//	public void setName(String name)
//	{
//		this.name = name;
//	}
//	public void setPhoneNo(String phoneNo)
//	{
//		this.phoneNo = phoneNo;
//	}
	
	public static Contact createContact(String name, String phoneNo)
	{
		return new Contact(name, phoneNo);
	}
}
