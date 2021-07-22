package com.jpm.section07.composition.challenge.gamingcomputer;

public class Tower
{
	private String size;
	private String manufacturer;
	private String model;
	
	public Tower(String size, String manufacturer, String model)
	{
		this.size = size;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public String getSize()
	{
		return size;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public String getModel()
	{
		return model;
	}
}