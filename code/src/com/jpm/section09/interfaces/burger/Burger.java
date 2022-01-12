package com.jpm.section09.interfaces.burger;

import java.util.ArrayList;
import java.util.List;

public class Burger
{
	private List<String> toppings = new ArrayList<String>();
	private String protein;
	private String typeOfBread;
	private int numberOfExtraPatties;
		
	public Burger(String protein, String tyoeOfBread)
	{
		this(protein, tyoeOfBread, null, 0);
	}
	
	public Burger(String protein, String typeOfBread, List<String> toppings, int numberOfExtraPatties)
	{
		this.protein = protein;
		this.typeOfBread = typeOfBread;
		this.toppings = toppings;
		this.numberOfExtraPatties = numberOfExtraPatties;
	}

	public List<String> getToppings()
	{
		return toppings;
	}

	public String getProtein()
	{
		return protein;
	}

	public String getTypeOfBread()
	{
		return typeOfBread;
	}
	
	public int getNumberOfExtraPatties()
	{
		return this.numberOfExtraPatties;
	}

	public void setToppings(List<String> toppings)
	{
		this.toppings = toppings;
	}

	public void setProtein(String protein)
	{
		this.protein = protein;
	}

	public void setTypeOfBread(String typeOfBread)
	{
		this.typeOfBread = typeOfBread;
	}
	
	public void setNumberOfPatties(int numberOfPatties)
	{
		this.numberOfExtraPatties = numberOfPatties;
	}
	
	public void printBurgerDetails()
	{
		System.out.println("Protein: " + this.protein);
		System.out.println("Number of extra patties: " + this.numberOfExtraPatties);
		System.out.println("Type of Bread: " + this.typeOfBread);
		System.out.println("Toppings: ");
		for(String s : this.toppings)
		{
			System.out.println(s);
		}
		System.out.println("----");
	}
}
