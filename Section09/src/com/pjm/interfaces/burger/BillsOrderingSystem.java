package com.pjm.interfaces.burger;

import java.text.NumberFormat;
import java.util.List;

public class BillsOrderingSystem implements OrderingSystem
{

	private double basePrice = 4.0;
	private double pricePerTopping = 0.30;
	private final double salesTax = 8.75/100;
	private double pricePerPatty = 1.25;

	
	/**
	 * Sales tax is not applied. 
	 */
	@Override
	public double calculateFinalPrice(List<Object> order)
	{
		double finalPrice = 0.0;
		for(Object o : order)
		{
			if(o instanceof Burger)
			{
				double pricePerBurger = calculatePricePerBurger((Burger) o);
				finalPrice += pricePerBurger;
			}
			else
			{
				return -1;
			}
		}
		
		return finalPrice;
	}
	
	private double calculateSalesTax(double finalPrice)
	{
		double salesTax = finalPrice * this.salesTax;
		return salesTax;
	}
	
	private double calculatePricePerBurger(Burger burger)
	{
		double pricePerBurger = 0.0;
		List<String> toppings = burger.getToppings();
		double toppingsPrice = this.pricePerTopping * toppings.size();
		double priceForExtraPatties = 0.0;
		priceForExtraPatties = burger.getNumberOfExtraPatties() * this.pricePerPatty;
		if(burger.getTypeOfBread().equalsIgnoreCase("gluten free"))
		{
			pricePerBurger += 0.30;
		}
		
		pricePerBurger += this.basePrice + toppingsPrice + priceForExtraPatties;
		
		return pricePerBurger;
	}
	
	@Override
	public void printReceipt(List<Object> order)
	{
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println("Receipt");
		for(Object o : order)
		{
			if(o instanceof Burger)
			{
				Burger b = (Burger) o;
				if (b instanceof DeluxeBurger)
				{
					System.out.println("\tDeluxe Burger");
				}
				else if (b instanceof HealthyBurger)
				{
					System.out.println("\tHealthy Burger");
				}
				else
				{
					System.out.println("\tCustom burger");
				}
				for(String s : b.getToppings())
				{
					System.out.println("\t\t" + s + ": $" + nf.format(this.pricePerTopping));
				}
				for(int i = 0; i < b.getNumberOfExtraPatties(); i++)
				{
					System.out.println("\t\tExtra patties: $" + this.pricePerPatty);
				}
				if(b.getTypeOfBread().equalsIgnoreCase("gluten free"))
				{
					System.out.println("\t\tgluten free: $0.30");
				}
				System.out.println("\t\tPrice: $" + nf.format(calculatePricePerBurger(b)));
			}
		}
		double finalPrice = calculateFinalPrice(order);
		double salesTax = calculateSalesTax(finalPrice);
		
		System.out.println("Sales tax: $" + nf.format(salesTax));
		System.out.println("Final price: $" + nf.format((finalPrice + salesTax)));
	}
}
