package com.pjm.interfaces.burger;

import java.util.List;

public class DeluxeBurger extends Burger
{
//	private int numberOfPatties = 2;
	
	public DeluxeBurger(String protein, String typeOfBread, List<String> toppings)
	{
		super(protein, typeOfBread, toppings, 1);
		toppings.add("bacon");
	}
	
	

//	@Override
//	public void buildBurger(Topping toppings, String protein, String typeOfBread)
//	{
//		toppings.addToppings("bacon");
//		toppings.addToppings("cheese");
//	}
//
//	@Override
//	public void printOrder(Topping toppings, String protein, String typeOfBread)
//	{
//		// TODO Auto-generated method stub
//		List<String> listOfToppings = toppings.getToppings();
//		System.out.println("Deluxe Burger with toppings: ");
//		for(String s : listOfToppings)
//		{
//			System.out.println(s);
//		}
//		System.out.println("Protein: " + protein);
//		System.out.println("Bread: " + typeOfBread);
//	}
//
//	public int getNumberOfPatties()
//	{
//		return this.numberOfPatties;
//	}

}