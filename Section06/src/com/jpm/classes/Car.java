package com.jpm.classes;

public class Car
{
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	public int getDoors()
	{
		return doors;
	}
	public int getWheels()
	{
		return wheels;
	}
	public String getModel()
	{
		return model;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getColor()
	{
		return color;
	}
	public void setDoors(int _doors)
	{
		this.doors = _doors;
	}
	public void setWheels(int _wheels)
	{
		this.wheels = _wheels;
	}
	public void setModel(String _model)
	{
		String validModel = _model.toLowerCase();
		this.model = validModel;
	}
	public void setEngine(String _engine)
	{
		this.engine = _engine;
	}
	public void setColor(String _color)
	{
		this.color = _color;
	}
	
	
}
