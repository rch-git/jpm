package com.jmp.oopchallenge;

import java.text.DecimalFormat;

public class MainHamburger
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		Hamburger h = new Hamburger();
		h.addOns("xyz");
		h.addOns("abc");
		h.addOns("def");
		h.addOns("ghi");
		h.addOns("jkl");
		System.out.println("Price: $" + df.format(h.getPrice()));
		
		HealthyBurger hb = new HealthyBurger();
		hb.addOns("1");
		hb.addOns("2");
		hb.addOns("3");
		hb.addOns("4");
		hb.addOns("5");
		hb.addOns("6");
		hb.addOns("7");
		
		System.out.println("Health burger price: $" + df.format(hb.getPrice()));
		System.out.println(hb.getRollType());
		
		DeluxeHamburger dh = new DeluxeHamburger();
		
	}
}
