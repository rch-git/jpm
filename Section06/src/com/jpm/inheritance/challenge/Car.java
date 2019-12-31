package com.jpm.inheritance.challenge;

public class Car extends Vehicle
{
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentGear;

	public Car(String _name, String _size, int wheels, int doors, int gears, boolean isManual)
	{
		super(_name, _size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
	}
	
	public Car()
	{
		// TODO Auto-generated constructor stub
		super();
	}

	public void changeGear(int currentGear)
	{
		this.currentGear = currentGear;
		System.out.println("Car.changeGear(): Gear changed to: " + this.currentGear);
	}
	
	public void changeVelocity(int speed, int direction)
	{
		System.out.println("Car.changeVelocity(): Velocity: " + speed + ", direction: " + direction);
		move(speed, direction);
	}
}
