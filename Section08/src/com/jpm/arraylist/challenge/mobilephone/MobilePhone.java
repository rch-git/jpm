package com.jpm.arraylist.challenge.mobilephone;

import java.util.Scanner;

public class MobilePhone
{
	private static Scanner scanner = new Scanner(System.in);
	private static Contacts contacts = new Contacts();
	
	public static void main(String[] args)
	{
		boolean quit = false;
		int choice;
		
		while(!quit)
		{
			System.out.println("Enter choice. Press 0 for list of options.");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice)
			{
				case 0: 
					printOptions();
					break;
				case 1:
					contacts.printContacts();
					break;
				case 2:
					System.out.println("Enter a contact name: ");
					String newContact = scanner.nextLine();
					contacts.addContact(newContact);
					System.out.println(newContact + " is added.");
					break;
				case 3:
					System.out.println("Enter the contact to modify: ");
					String currentName = scanner.nextLine();
					System.out.println("Enter new name: ");
					String newName = scanner.nextLine();
					contacts.modifyContact(currentName, newName);
					break;
				case 4:
					System.out.println("Enter the contact name to remove: ");
					String removeContact = scanner.nextLine();
					boolean success = contacts.removeContact(removeContact);
					if(success)
					{
						System.out.println(removeContact + " has been removed.");
					}
					else
					{
						System.out.println(removeContact + " does not exist.");
					}
					break;
				case 5:
					System.out.println("Enter the name of the contact to search: ");
					String searchContact = scanner.nextLine();
					contacts.findContact(searchContact);
					break;
				case 6:
					break;
				default: 
					System.out.println("Invalid option. Try again.");
					
			}
		}
	}
	
	public static void printOptions()
	{
		System.out.println("0. Print options");
		System.out.println("1. Print list of contacts");
		System.out.println("2. Add a contact");
		System.out.println("3. Modify a contact");
		System.out.println("4. Remove a contact");
		System.out.println("5. Search for a contact");
		System.out.println("6. Quit");
	}
}
