package com.jpm.composition.challenge.gamingcomputer;

public class Processor
{
	private String chipset;
	private double clockSpeed;
	private double boostClock;
	private String model;
	
	public Processor(String chipset, double clockSpeed, double boostClock, String model)
	{
		this.chipset = chipset;
		this.clockSpeed = clockSpeed;
		this.boostClock = boostClock;
		this.model = model;
	}

	public String getChipset()
	{
		return chipset;
	}

	public double getClockSpeed()
	{
		return clockSpeed;
	}

	public double getBoostClock()
	{
		return boostClock;
	}

	public String getModel()
	{
		return model;
	}
}
