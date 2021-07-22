package com.jpm.section07.composition.challenge;

public class Furniture
{
	private int numOfTables;
	private int numOfChairs;
	
	public Furniture(int numOfTables, int numOfChairs)
	{
		this.numOfTables = numOfTables;
		this.numOfChairs = numOfChairs;
	}

	public int getNumOfTables()
	{
		return numOfTables;
	}

	public int getNumOfChairs()
	{
		return numOfChairs;
	}
	
	
}
