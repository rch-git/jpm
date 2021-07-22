package com.jpm.section08.arraylist.challenge.mobilephone;

import java.util.ArrayList;
import java.util.List;

public class Contacts
{
	private String name;
	private long phoneNo;
	private List<String> contacts = new ArrayList<String>();
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public long getPhoneNo()
	{
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo = phoneNo;
	}

	public List<String> getContacts()
	{
		return contacts;
	}

//	public void setContacts(List<String> contacts)
//	{
//		this.contacts = contacts;
//	}

	
	
	public void addContact(String name)
	{
		contacts.add(name);
	}
	
	public boolean removeContact(String name)
	{
		boolean contactExists = removeContact(name);
		return contactExists;
	}
	
	public void findContact(String name)
	{
		int index = contacts.indexOf(name);
		
		if(index >=0)
		{
			System.out.println(name + " exists in Contacts list.");
		}
		else
		{
			System.out.println(name + " does not exist in the Contacts list.");
		}
	}
	
	public void modifyContact(String currentName, String newName)
	{
		int index = contacts.indexOf(currentName);
		
		if(index >= 0)
		{
			contacts.set(index, newName);
		}
		else
		{
			System.out.println(currentName + " does not exist.");
		}
	}
	
	public void printContacts()
	{
		for (int i = 0; i < contacts.size(); i++)
		{
			System.out.println((i+1) + ". " + contacts.get(i));
		}
	}
}