package com.jpm.section07.composition;

public class Motherboard
{
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios)
	{
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) throws InterruptedException
	{
		System.out.println("Program: " + programName + " is now loading...");
		Thread.sleep(2000);
		System.out.println("Done.");
	}

	public String getModel()
	{
		return model;
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public int getRamSlots()
	{
		return ramSlots;
	}

	public int getCardSlots()
	{
		return cardSlots;
	}

	public String getBios()
	{
		return bios;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public void setRamSlots(int ramSlots)
	{
		this.ramSlots = ramSlots;
	}

	public void setCardSlots(int cardSlots)
	{
		this.cardSlots = cardSlots;
	}

	public void setBios(String bios)
	{
		this.bios = bios;
	}
	
	
	
}
