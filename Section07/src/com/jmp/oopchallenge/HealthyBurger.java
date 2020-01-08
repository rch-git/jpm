package com.jmp.oopchallenge;

public class HealthyBurger extends Hamburger
{
	private final int HB_MAX_ADDONS = 6;
	
	public HealthyBurger()
	{
		super("brown bread");
	}
	
	public void addOns(String addon)
	{
		int numAddons = 0;
		double price = getPrice();
		if(numAddons < HB_MAX_ADDONS)
		{
			System.out.println("The following is added to the burger: " + addon);
			price += 0.15;
			setPrice(price);
			numAddons += 1;
		}
		else
		{
			System.out.println("Maximum addons reached. " + addon + " cannot be added.");
		}
	}
	
}
