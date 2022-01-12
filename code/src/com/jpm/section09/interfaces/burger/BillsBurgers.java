package com.jpm.section09.interfaces.burger;

import java.util.List;

public class BillsBurgers
{

	public static void main(String[] args)
	{
		BillsOrderingSystem bos = new BillsOrderingSystem();
		List<Object> burgers = BuildBurgers.buildBurger();
		System.out.println("---Burger details---");
		for(Object b : burgers)
		{
			if(b instanceof Burger)
			{
				((Burger) b).printBurgerDetails();
			}
		}
		bos.printReceipt(burgers);
	}
}
