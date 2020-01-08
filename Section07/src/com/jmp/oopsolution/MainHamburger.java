package com.jmp.oopsolution;

public class MainHamburger
{
	public static void main(String[] args)
	{
		Hamburger hamburger = new Hamburger("Basic", "white", "sausage", 3.56);
		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("tomato", 0.27);
		hamburger.addHamburgerAddition2("lettuce", 0.75);
		hamburger.addHamburgerAddition3("tomato", 1.13);
		System.out.println("Total price of the burger is: " + hamburger.itemizeHamburger());
	}
}
