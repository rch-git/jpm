package com.pjm.interfaces.burger;

import java.util.ArrayList;
import java.util.List;


public class BuildBurgers
{
	public static List<Object> buildBurger()
	{
		List<Object> burgers = new ArrayList<Object>();
		
//		HealthyBurger
		List<String> toppingshb = new ArrayList<String>();
		toppingshb.add("bacon");
		toppingshb.add("totmato");
		toppingshb.add("lettuce");
		toppingshb.add("cheese");
		HealthyBurger hb = new HealthyBurger("wheat", toppingshb);
		burgers.add(hb);
		
//		Deluxe Burger
		List<String> toppingsdb = new ArrayList<String>();
		toppingsdb.add("bacon");
		toppingsdb.add("totmato");
		toppingsdb.add("lettuce");
		toppingsdb.add("cheese");
		DeluxeBurger db = new DeluxeBurger("hamburger", "sesame seed", toppingsdb);
		burgers.add(db);
		
//		customBurger1
		List<String> toppings2 = new ArrayList<String>();
		toppings2.add("bacon");
		toppings2.add("totmato");
		toppings2.add("lettuce");
		toppings2.add("cheese");
		Burger customBurger1 = new Burger("hamburger", "white", toppings2, 1);
		burgers.add(customBurger1);
		
//		burgerHA
		List<String> toppingsHA = new ArrayList<String>();
		toppingsHA.add("bacon");
		toppingsHA.add("bacon");
		toppingsHA.add("totmato");
		toppingsHA.add("lettuce");
		toppingsHA.add("cheese");		
		Burger burgerHA = new Burger("hamburger", "white", toppingsHA, 3);
		burgers.add(burgerHA);
		
		return burgers;
	}
}
