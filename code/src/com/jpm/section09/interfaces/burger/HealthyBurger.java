package com.jpm.section09.interfaces.burger;

import java.util.List;

public class HealthyBurger extends Burger
{
	
	public HealthyBurger(String typeOfBread, List<String> toppings)
	{
		super("black bean", typeOfBread, toppings, 0);
	}

}
