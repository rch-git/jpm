package com.jpm.controlflow;

public class Switch
{

	public static void main(String[] args)
	{
		int switchValue = 1;
		
		String[] abc = {"a", "b", "c"}; 
		
		switch(abc[1])
		{
			case "a":
				System.out.println("a");
				break;
			default:
				System.out.println("default");
				break;
		}
		
		char switchChar = 'A';
		
		switch(switchChar)
		{
			case 'A': 
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			case 'C':
				System.out.println("C");
				break;
			case 'D':
				System.out.println("D");
				break;
			case 'E':
				System.out.println("E");
				break;
			default:
				System.out.println("Nothing found.");
				break;
		}
	}

}
