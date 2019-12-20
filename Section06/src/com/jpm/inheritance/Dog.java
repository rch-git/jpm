package com.jpm.inheritance;

public class Dog extends Animal
{
	private int eyes;
	private int tail;
	private int legs;
	private int teeth;
	private String coat;

	public Dog(String name, int brain, int body, int size, int weight)
	{
		super("dog", 1, 1, 1, 20);
	}
}
