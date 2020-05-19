package com.jpm.interfaces.challenge.saveable.solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main
{
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Player p1 = new Player("player 1", 20, 15);
//		ISavable p1 = new Player("player 1", 20, 15);
		System.out.println(p1.toString());
		saveObject(p1);
		
		p1.setHitPoints(8);
		System.out.println(p1);
		p1.setWeapon("spear");
		saveObject(p1);
//		loadObject(p1);
		System.out.println(p1);
		
		ISavable warewolf = new Monster("warewolf", 20, 40);
		System.out.println(warewolf);
		
		saveObject(warewolf);
		loadObject(warewolf);
		System.out.println(warewolf.toString());
		System.out.println("Monster name: " + ((Monster) warewolf).getName());
		System.out.println("Monster Strength: " + ((Monster) warewolf).getStrength());
	}

	public static List<String> readValues()
	{
//		Testing the use of a vector internally 
		Vector<String> values = new Vector<String>();
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Enter a string:");
			String stringInput = scanner.nextLine();
			values.add(i, stringInput);
		}
		
		return values;
	}
	
	public static void saveObject(ISavable objectToSave)
	{
		for(int i = 0; i < objectToSave.write().size(); i++)
		{
			System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
		}
	}
	
	public static void loadObject(ISavable objectToLoad)
	{
		List<String> readValues = readValues();
		if(readValues instanceof LinkedList)
		{
			System.out.println("it is a linked list");
		}
		else
		{
			System.out.println("Its not a linked list");
		}
		objectToLoad.read(readValues);
		
	}
}