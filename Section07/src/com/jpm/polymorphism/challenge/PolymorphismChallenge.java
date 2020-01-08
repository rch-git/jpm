package com.jpm.polymorphism.challenge;

public class PolymorphismChallenge
{
	public static void main(String[] args)
	{
		Car c1 = new C1();
		Car c2 = new C2();
		Car c3 = new C3();
		Car c4 = new C4();
		
		System.out.println("Name: " + c1.getName() + ", transmission: " + c1.getTransmission());
		System.out.println("Name: " + c2.getName() + ", transmission: " + c2.getTransmission());
		System.out.println("Name: " + c3.getName() + ", transmission: " + c3.getTransmission());
		System.out.println("Name: " + c4.getName() + ", transmission: " + c4.getTransmission());
	}
}

class Car
{
	private int cylinders;
	private int wheels;
	private String name;
	
	public Car(int cylinders, String name)
	{
		this.cylinders = cylinders;
		this.wheels = 4;
		this.name = name;
	}

	public int getCylinders()
	{
		return cylinders;
	}

	public int getWheels()
	{
		return wheels;
	}

	public String getName()
	{
		return name;
	}

	public String getTransmission()
	{
		return "Class name: " + getClass().getSimpleName() + ", No transmission set";
	}
}

class C1 extends Car
{
	public C1()
	{
		super(4, "C1");
	}
	
	public String getTransmission()
	{
		return "Automatic";
	}
}

class C2 extends Car
{
	public C2()
	{
		super(4, "C2");
	}
	
	public String getTransmission()
	{
		return "CVT";
	}
}

class C3 extends Car
{
	public C3()
	{
		super(4, "C3");
	}
	
	public String getTransmission()
	{
		return "Manual";
	}
}

class C4 extends Car
{
	public C4()
	{
		super(4, "C4");
	}
}