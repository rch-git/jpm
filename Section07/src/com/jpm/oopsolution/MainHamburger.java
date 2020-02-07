package com.jpm.oopsolution;

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
		
		HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);
				
		healthyBurger.addHamburgerAddition1("egg", 5.43);
		healthyBurger.addHealthAddition1("lentils", 3.41);
		System.out.println("Total price of the healthy burger is: " + healthyBurger.itemizeHamburger());
		
		DeluxeBurger db = new DeluxeBurger();
		System.out.println("Final price: " + db.itemizeHamburger());
	}
}
