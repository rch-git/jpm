package com.jpm.arraylist.challenge.mobilephone.solution;

import java.util.Scanner;

public class MainMobilePhone
{
	private static Scanner scanner = new Scanner(System.in);
	
	private static MobilePhone mb = new MobilePhone("555-555-5555");
	
	public static void main(String[] args)
	{
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit)
		{
			System.out.println("Enter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			 
			switch(action)
			{
				case 0:
					System.out.println("Shutting down.");
					quit = true;
					break;
				case 1:
					mb.printContact();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					queryContact();
					break;
				case 6:
					printActions();
					break;
			}
		}
	}
	
	
	private static void startPhone()
	{
		System.out.println("Starting phone...");
	}
	
	private static void printActions()
	{
		System.out.println("Available actions (Press 0): ");
		System.out.println("0. Shutdown phone\r\n" + 
				"1. Print contacts\r\n" + 
				"2. Add contact\r\n" + 
				"3. Update an existing contact\r\n" + 
				"4. Remove a contact\r\n" + 
				"5. Query for a contact\r\n" + 
				"6. Print list of actions");
		System.out.println("Choose your action.");
	}
	
	private static void addNewContact()
	{
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter phone number: ");
		String phoneNo = scanner.nextLine();
		
//		Contact c = new Contact(name, phoneNo);
		Contact c = Contact.createContact(name, phoneNo);
		if(mb.addNewContact(c))
		{
			System.out.println("New contact added. Name: " + name + "; phone: " + phoneNo);
		}
		else
		{
			System.out.println("Contact already exists.");
		}
	}
	
	private static void updateContact()
	{
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mb.queryContact(name);
		if(existingContactRecord == null)
		{
			System.out.println("Contact not found.");
			return;
		}
		
		System.out.println("Enter new contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact phone number (Enter -1 to leave number unchanged): ");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mb.updateContact(existingContactRecord, newContact))
		{
			System.out.println("Successfully updated record.");
		}
		else
		{
			System.out.println("Error updating record.");
		}
	}
	
	public static void removeContact()
	{
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mb.queryContact(name);
		if(existingContactRecord == null)
		{
			System.out.println("Contact not found.");
			return;
		}
		
		if(mb.removeContact(existingContactRecord))
		{
			System.out.println("Successfully deleted.");
		}
		else
		{
			System.out.println("Error deleting record.");
		}
	}
	
	public static void queryContact()
	{
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mb.queryContact(name);
		if(existingContactRecord == null)
		{
			System.out.println("Contact not found.");
			return;
		}
		
		System.out.println("Name: " + existingContactRecord.getName());
		System.out.println("Name: " + existingContactRecord.getPhoneNo());
	}
}
