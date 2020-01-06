package com.jpm.composition.challenge.gamingcomputer;

public class Storage
{
	private int capacity;
	private String type;
	private String manufacturer;
	
	public Storage(int capacity, String type, String manufacturer)
	{
		this.capacity = capacity;
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public String getType()
	{
		return type;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}
}
