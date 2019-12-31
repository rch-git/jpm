package com.jpm.inheritance;

public class Dog extends Animal
{
	private int eyes;
	private int tail;
	private int legs;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int tail, int teeth, String coat)
	{
		super("dog", 1, 1, 1, 20);
		this.eyes = 2;
		this.legs = 4;
	}
	
	@Override
	public void eat()
	{
		// TODO Auto-generated method stub
		System.out.println("dog.eat");
		chew();
		super.eat();
	}
	
	public void walk()
	{
		System.out.println("dog.walk called.");
		move(5);
	}
	
	public void run()
	{
		System.out.println("dog.run called.");
		move(10);
	}
	
	private void chew()
	{
		System.out.println("dog.chew");
	}

	public int getEyes()
	{
		return eyes;
	}

	public int getTail()
	{
		return tail;
	}

	public int getLegs()
	{
		return legs;
	}

	public int getTeeth()
	{
		return teeth;
	}

	public String getCoat()
	{
		return coat;
	}

	public void setEyes(int _eyes)
	{
		this.eyes = _eyes;
	}

	public void setTail(int _tail)
	{
		this.tail = _tail;
	}

	public void setLegs(int _legs)
	{
		this.legs = _legs;
	}

	public void setTeeth(int _teeth)
	{
		this.teeth = _teeth;
	}

	public void setCoat(String _coat)
	{
		this.coat = _coat;
	}
}