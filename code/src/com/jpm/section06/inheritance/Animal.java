package com.jpm.section06.inheritance;

public class Animal
{
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brain, int body, int size, int weight)
	{
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	
	public void move(int speed)
	{
		System.out.println("animal.move called. moving at speed: " + speed);
	}
	
	public void eat()
	{
		System.out.println("Animal.eat");
	}
	
	public String getName()
	{
		return name;
	}
	public int getBrain()
	{
		return brain;
	}
	public int getBody()
	{
		return body;
	}
	public int getSize()
	{
		return size;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setName(String _name)
	{
		this.name = _name;
	}
	public void setBrain(int _brain)
	{
		this.brain = _brain;
	}
	public void setBody(int _body)
	{
		this.body = _body;
	}
	public void setSize(int _size)
	{
		this.size = _size;
	}
	public void setWeight(int _weight)
	{
		this.weight = _weight;
	}
	
	

}
