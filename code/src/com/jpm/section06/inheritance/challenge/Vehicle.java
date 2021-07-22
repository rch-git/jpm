package com.jpm.section06.inheritance.challenge;

public class Vehicle
{
	private String name;
	private String size;
	private int currentVelocity;
	private int currentDirection;
	
	public Vehicle(String _name, String _size)
	{
		this.name = _name;
		this.size = _size;
		
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}
	
	public Vehicle()
	{
		// TODO Auto-generated constructor stub
	}

	public void steer(int direction)
	{
		this.currentDirection += direction;
		System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
	}
	
	public void move(int velocity, int direction)
	{
		this.currentVelocity = velocity;
		this.currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at: " + this.currentVelocity + " in direction " + this.currentDirection);
	}
	
	public void stop()
	{
		this.currentVelocity = 0;
	}

	public String getName()
	{
		return name;
	}

	public String getSize()
	{
		return size;
	}

	public int getCurrentVelocity()
	{
		return currentVelocity;
	}

	public int getCurrentDirection()
	{
		return currentDirection;
	}
	

}