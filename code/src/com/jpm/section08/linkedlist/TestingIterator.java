package com.jpm.section08.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestingIterator
{

	public static void main(String[] args)
	{
		LinkedList<String> linkedListStrings = populateLinkedList();
		iterateList(linkedListStrings);

	}
	
	private static LinkedList<String> populateLinkedList()
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("x");
		linkedList.add("y");
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		
		return linkedList;
	}
	
	private static void iterateList(LinkedList<String> linkedList)
	{
		ListIterator<String> li = linkedList.listIterator();
		
		while(li.hasNext())
		{
			System.out.println("Next index: " + li.nextIndex());
			System.out.println("Next string: " + li.next());
		}
		
		while(li.hasPrevious())
		{
			System.out.println("Previous index: " + li.previousIndex());
			System.out.println("Previous string: " + li.previous());
		}
	}
}
