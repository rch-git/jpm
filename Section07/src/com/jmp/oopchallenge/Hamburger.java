package com.jmp.oopchallenge;

public class Hamburger
{
	private String rollType;
	private String meatType;
	private double price;
	private int numberOfAddons;
	private final int MAX_ADDONS = 4;
	
	public Hamburger()
	{
		this.rollType = "Regular buns";
		this.meatType = "Hamburger";
		this.price = 5;
	}
	
	public Hamburger(String _rollType)
	{
		this.rollType = _rollType;
		this.meatType = "Hamburger";
		this.price = 5;
	}

	public String getRollType()
	{
		return rollType;
	}

	public String getMeatType()
	{
		return meatType;
	}

	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getNumberOfAddons()
	{
		return numberOfAddons;
	}
	
	protected void addOns(String addon)
	{
		if(this.numberOfAddons < MAX_ADDONS)
		{
			System.out.println("The following is added to the burger: " + addon);
			this.price += 0.15;
			this.numberOfAddons += 1;
		}
		else
		{
			System.out.println("Maximum addons reached. " + addon + " cannot be added.");
		}
	}
}
