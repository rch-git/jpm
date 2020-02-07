package com.jpm.oopchallenge;

public class HealthyBurger extends Hamburger
{
	private final int HB_MAX_ADDONS = 6;
	private int numberOfAddons;
	
	public HealthyBurger()
	{
		super("brown bread");
	}
	
	@Override
	public void addOns(String addon)
	{
		double price = getPrice();
		if(this.numberOfAddons < HB_MAX_ADDONS)
		{
			System.out.println("The following is added to the burger: " + addon);
			price += 0.15;
			setPrice(price);
			this.numberOfAddons += 1;
		}
		else
		{
			System.out.println("Maximum addons reached. " + addon + " cannot be added.");
		}
	}
	
	@Override
	public int getNumberOfAddons()
	{
		return numberOfAddons;
	}
}