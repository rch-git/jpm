package com.jpm.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Demo
{

	public static void main(String[] args)
	{
		LinkedList<String> linkedList = populateLinkedList();
		
		printList(linkedList);
		
		ArrayList<String> arrayList = populateArrayList();
		
		printList(arrayList);
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

	private static ArrayList<String> populateArrayList()
	{
		ArrayList<String> placesToVisit = new ArrayList<String>();
		
//		placesToVisit.add("A");
//		placesToVisit.add("B");
//		placesToVisit.add("C");
//		placesToVisit.add("D");
//		placesToVisit.add("E");
//		placesToVisit.add("F");
//		placesToVisit.add("G");
//		placesToVisit.add("H");
		placesToVisit.add("A");
		placesToVisit.add("V");
		placesToVisit.add("C");
		placesToVisit.add("G");
		placesToVisit.add("P");
		placesToVisit.add("N");
		placesToVisit.add("Q");
		placesToVisit.add("Y");
		placesToVisit.add("This is an array list");
		
		placesToVisit.add(1, "New entry");
		
		return placesToVisit;
	}
	
	private static LinkedList<String> populateLinkedList()
	{
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		placesToVisit.add("A");
		placesToVisit.add("V");
		placesToVisit.add("C");
		placesToVisit.add("G");
		placesToVisit.add("P");
		placesToVisit.add("N");
		placesToVisit.add("Q");
		placesToVisit.add("Y");
		placesToVisit.add("This is a Linked list");
		
		addInOrder(placesToVisit, "XNew city");
		
//		placesToVisit.add(1, "New entry");
		
		return placesToVisit;
	}
	
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
	{
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext())
		{
			System.out.println("Previous index: " + stringListIterator.previousIndex());
			System.out.println("Next index: " + stringListIterator.nextIndex());
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
}
