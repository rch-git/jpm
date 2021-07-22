package com.jpm.section06.inheritance.covariant;

public class HealthyBurgerFactory extends BurgerFactory
{

//	This is an example of an overridden method returning a covariant.
//	Because this method is overriding the method in the super class, it is not possible
//	to call createBurger method from the super class directly from an instance of HealthyBurgerFactory
	@Override
	public HealthyBurger createBurger()
	{
		// TODO Auto-generated method stub
		return new HealthyBurger();
	}
	
	public HealthyBurger create()
	{
		return new HealthyBurger();
	}
}