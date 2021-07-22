package com.jpm.section07.composition.challenge.gamingcomputer;

public class PowerSupply
{
	private int wattage;
	private String manufacturer;
	private String rating;
	
	public PowerSupply(int wattage, String manufacturer, String rating)
	{
		this.wattage = wattage;
		this.manufacturer = manufacturer;
		this.rating = rating;
	}

	public int getWattage()
	{
		return wattage;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public String getRating()
	{
		return rating;
	}
}
