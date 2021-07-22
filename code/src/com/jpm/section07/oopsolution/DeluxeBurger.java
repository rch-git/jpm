package com.jpm.section07.oopsolution;

public class DeluxeBurger extends Hamburger
{

	public DeluxeBurger()
	{
		super("Deluxe", "White", "Sausage & Bacon", 14.54);
		super.addHamburgerAddition1("chips", 2.75);
		super.addHamburgerAddition2("drink", 1.81);
	}

	@Override
	public void addHamburgerAddition1(String name, double price)
	{
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items");
	}

	@Override
	public void addHamburgerAddition2(String name, double price)
	{
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items");
	}

	@Override
	public void addHamburgerAddition3(String name, double price)
	{
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items");
	}

	@Override
	public void addHamburgerAddition4(String name, double price)
	{
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items");
	}
}
