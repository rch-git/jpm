package com.jpm.section09.abstractclass;

public class Penguin extends Bird
{

	public Penguin(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly()
	{
		System.out.println(getName() + " can't fly. Class:" + this.getClass().getCanonicalName());
	}
}
