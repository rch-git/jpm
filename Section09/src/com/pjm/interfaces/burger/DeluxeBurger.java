package com.pjm.interfaces.burger;

import java.util.List;

public class DeluxeBurger extends Burger
{
	public DeluxeBurger(String protein, String typeOfBread, List<String> toppings)
	{
		super(protein, typeOfBread, toppings, 1);
		toppings.add("bacon");
	}
	
	public DeluxeBurger(List<String> toppings)
	{
		super("hamburger", "seseame seed", toppings, 1);
		toppings.add("bacon");
	}
}