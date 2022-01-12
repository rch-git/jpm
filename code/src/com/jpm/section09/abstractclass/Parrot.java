package com.jpm.section09.abstractclass;

public class Parrot extends Bird
{
	public Parrot(String name)
	{
		super(name);
	}

	@Override
	public void fly()
	{
		System.out.println(getName() + " flying. Class:" + this.getClass().getCanonicalName());
	}
}
