package com.jpm.section08.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain
{
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList gl = new GroceryList();
	
	public static void main(String[] args)
	{
		
		
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit)
		{
			System.out.println("Enter choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice)
			{
				case 0:
					printInstructions();
					break;
				case 1:
					gl.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6: 
					processArrayList();
				case 7:
					quit = true;
					break;
				default:
					System.out.println("Incorrect choice. Try again.");
			}
		}
	}

	public static void processArrayList()
	{
		ArrayList<String> newArrayList = new ArrayList<String>();
		newArrayList.addAll(gl.getGroceryList());
		
		ArrayList<String> nextArray = new ArrayList<String>(gl.getGroceryList());
		
		String[] myArray = new String[gl.getGroceryList().size()];
		myArray = gl.getGroceryList().toArray(myArray);
	}

	private static void printInstructions()
	{
		System.out.println("Press ");
		System.out.println("0 - Print instructions.");
		System.out.println("1 - Print list of items.");
		System.out.println("2 - Add an item to the list.");
		System.out.println("3 - Modify an item in the list.");
		System.out.println("4 - Remove an item from the list.");
		System.out.println("5 - Search an item in the list.");
		System.out.println("6 - Quit the application.");
	}
	
	public static void addItem()
	{
		System.out.println("Enter the item to add: ");
		gl.addGroceryItem(scanner.nextLine());
	}
	
	public static void modifyItem()
	{
		System.out.println("Enter item name: ");
		String currentItem = scanner.nextLine();
				
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		gl.modifyGroceryItem(currentItem, newItem);
	}
	
	public static void removeItem()
	{
		System.out.println("Remove grocery item: ");
		String item = scanner.nextLine();
		
		gl.removeGroceryItem(item);
	}
	
	public static void searchForItem()
	{
		System.out.println("Enter item to search for: ");
		String searchItem = scanner.nextLine();
		if(gl.onFile(searchItem))
		{
			System.out.println("Found " + searchItem + " in our grocery list.");
		}
		else
		{
			System.out.println(searchItem + " is not found.");
		}
	}
}