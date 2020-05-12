package com.pjm.interfaces.burger;

import java.util.List;

public class BillsBurgers
{

	public static void main(String[] args)
	{
		BillsOrderingSystem bos = new BillsOrderingSystem();
		List<Object> burgers = BuildBurgers.buildBurger();
		bos.printReceipt(burgers);
	}
}
