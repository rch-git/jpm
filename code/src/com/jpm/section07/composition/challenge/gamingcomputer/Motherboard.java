package com.jpm.section07.composition.challenge.gamingcomputer;

public class Motherboard
{
	private String model;
	private String manufacturer;
	
	public Motherboard(String model, String manufacturer)
	{
		this.model = model;
		this.manufacturer = manufacturer;
	}

	public String getModel()
	{
		return model;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}
}
