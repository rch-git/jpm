package com.jpm.abstractclass;

public class Dog extends Animal
{

	public Dog(String name)
	{
		super(name);
	}

	@Override
	public void eat()
	{
		System.out.println(getName() + " is eating. Class:" + this.getClass().getCanonicalName());
	}

	@Override
	public void breathe()
	{
		System.out.println(getName() + " is breathing. Class:" + this.getClass().getCanonicalName());
	}
}
