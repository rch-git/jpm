package com.jpm.section09.abstractclass;

public abstract class Bird extends Animal
{

	public Bird(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println(getName() + " eating. Class:" + this.getClass().getCanonicalName());
	}

	@Override
	public void breathe()
	{
		System.out.println(getName() + " breating. Class:" + this.getClass().getCanonicalName());
	}
	
	public abstract void fly();
}
