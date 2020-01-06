package com.jpm.composition.challenge.gamingcomputer;

public class VideoCard
{
	private String chipset;
	private String manufacturer;
	private String model;
	
	public VideoCard(String chipset, String manufacturer, String model)
	{
		this.chipset = chipset;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public String getChipset()
	{
		return chipset;
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
