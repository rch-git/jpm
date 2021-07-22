package com.jpm.section08.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Demo
{
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		LinkedList<String> linkedList = populateLinkedList();
		
		printList(linkedList);
		
		visit(linkedList);
		
//		ArrayList<String> arrayList = populateArrayList();
//		
//		printList(arrayList);
	}
	
	private static void printList(List<String> list)
	{
		Iterator<String> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println("Now visting: " + i.next());
		}
		System.out.println("=============");
	}

//	private static ArrayList<String> populateArrayList()
//	{
//		ArrayList<String> placesToVisit = new ArrayList<String>();
//		
//		placesToVisit.add("A");
//		placesToVisit.add("V");
//		placesToVisit.add("C");
//		placesToVisit.add("G");
//		placesToVisit.add("P");
//		placesToVisit.add("N");
//		placesToVisit.add("Q");
//		placesToVisit.add("Y");
//		placesToVisit.add("This is an array list");
//		
//		placesToVisit.add(1, "New entry");
//		
//		return placesToVisit;
//	}
	
	private static LinkedList<String> populateLinkedList()
	{
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
//		placesToVisit.add("A");
//		placesToVisit.add("V");
//		placesToVisit.add("C");
//		placesToVisit.add("G");
//		placesToVisit.add("P");
//		placesToVisit.add("N");
//		placesToVisit.add("Q");
//		placesToVisit.add("Y");
//		placesToVisit.add("This is a Linked list");
		
		addInOrder(placesToVisit, "X");
		addInOrder(placesToVisit, "Z");
		addInOrder(placesToVisit, "D");
		addInOrder(placesToVisit, "Y");
		addInOrder(placesToVisit, "Y");
		addInOrder(placesToVisit, "E");
		addInOrder(placesToVisit, "A");
		addInOrder(placesToVisit, "XNew city");
		addInOrder(placesToVisit, "ZZZZZ");
		addInOrder(placesToVisit, "zzzzz");
		addInOrder(placesToVisit, "x");
		
//		placesToVisit.add(1, "New entry");
		
		return placesToVisit;
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
	{
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext())
		{
//			System.out.println("Previous index: " + stringListIterator.previousIndex());
//			System.out.println("Next index: " + stringListIterator.nextIndex());
			int comparison = stringListIterator.next().compareTo(newCity);
			
			if(comparison == 0)
			{
//				newCity is equal to the element at the index
				System.out.println(newCity + " is already a destination.");
				return false;
			}
			else if (comparison > 0)
			{
//				newCity should appear before the element at the current index
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}
			else if (comparison < 0)
			{
//				move on to next city
				
			}
		}
		
		stringListIterator.add(newCity);
		return true;
	}
	
	private static void visit(LinkedList<String> cities)
	{
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty())
		{
			System.out.println("No cities in the list.");
		}
		else
		{
			System.out.println("Now visiting: " + listIterator.next());
			printMenu();
			
		}
		while(!quit)
		{
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action)
			{
				case 0:
					System.out.println("Vacation Over");
					quit = true;
					break;
				case 1:
					if(!goingForward)
					{
						if(listIterator.hasNext())
						{
							listIterator.next();
						}
						goingForward = true;
					}
					if(listIterator.hasNext())
					{
						System.out.println("Now visiting: " + listIterator.next());
					}
					else
					{
						System.out.println("Reached the end of the list.");
						goingForward = false;
						listIterator.previous();
					}
					break;
				case 2:
					if(goingForward)
					{
						if(listIterator.hasPrevious())
						{
							listIterator.previous();
						}
						goingForward = false;
					}
					if(listIterator.hasPrevious())
					{
						System.out.println("Now visiting: " + listIterator.previous());
					}
					else
					{
						System.out.println("We are at the start of the list.");
						goingForward = true;
						listIterator.next();
					}
					break;
				case 3:
					printMenu();
					break;
				default:
					System.out.println("Invalid option");
					break;
			}
		}
	}
	
	private static void printMenu()
	{
		System.out.println("Available options: ");
		System.out.println("0. Quit");
		System.out.println("1. Go to next city");
		System.out.println("2. Go to previous city");
		System.out.println("3. Print menu options");
	}
	
}
