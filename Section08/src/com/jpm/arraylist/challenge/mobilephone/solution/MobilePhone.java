package com.jpm.arraylist.challenge.mobilephone.solution;

import java.util.ArrayList;

public class MobilePhone
{
	private String myNumber; 
	private ArrayList<Contact> myContacts;
	
	public MobilePhone(String myNumber)
	{
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact)
	{
		if(findContact(contact.getName()) >= 0)
		{
			System.out.println("Contact is already on file.");
			return false;
		}
		
		myContacts.add(contact);
		return true;
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact)
	{
		int foundPosition = findContact(oldContact);
		if (foundPosition < 0)
		{
			System.out.println(oldContact.getName() + " is not found.");
			return false;
		}
		else if(findContact(newContact.getName()) != -1)
		{
			System.out.println(newContact.getName() + " already exists.");
			return false;
		}
		
//		If the user entered -1 for phone number, then get the phone number from the oldContact, and set it 
//		as the phone number for newContact
		if(newContact.getPhoneNo().equals("-1"))
		{
			newContact = Contact.createContact(newContact.getName(), oldContact.getPhoneNo());
		}
		
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + " is replaced with " + newContact.getName());
		return true;
	}
	
	private int findContact(Contact c)
	{
		return this.myContacts.indexOf(c);
	}
	
	private int findContact(String contactName)
	{
		for (int i = 0; i < this.myContacts.size(); i++)
		{
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName))
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public String queryContact(Contact c)
	{
		if(findContact(c) >= 0)
		{
			return c.getName();
		}
		return null;
	}
	
	public Contact queryContact(String name)
	{
		int position = findContact(name);
		if(position >= 0)
		{
			return this.myContacts.get(position);
		}

		return null; 
	}
	
	public boolean removeContact(Contact c)
	{
		int foundPosition = findContact(c);
		if (foundPosition < 0)
		{
			System.out.println(c.getName() + " is not found.");
			return false;
		}
		this.myContacts.remove(foundPosition);
		System.out.println(c.getName() + " has been removed.");
		return true;
	}
	
	public void printContact()
	{
		for(int i = 0; i < this.myContacts.size(); i++)
		{
			System.out.println((i + 1) + ". Name: " + this.myContacts.get(i).getName() + 
						", Number: " + this.myContacts.get(i).getPhoneNo());
		}
	}
}