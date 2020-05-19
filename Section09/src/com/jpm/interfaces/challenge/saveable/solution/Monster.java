package com.jpm.interfaces.challenge.saveable.solution;

import java.util.LinkedList;
import java.util.List;

public class Monster implements ISavable
{
	private String name; 
	private int hitPoints;
	private int strength;
	
	public Monster(String name, int hitPoints, int strength)
	{
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}
	
	@Override
	public List<String> write()
	{
//		Using linked list just to test
		List<String> values = new LinkedList<String>();
		values.add(0, getName());
		values.add(1, String.valueOf(getHitPoints()));
		values.add(2, String.valueOf(getStrength()));
		
		return values;
	}

	@Override
	public void read(List<String> savedValues)
	{
		if(savedValues != null && savedValues.size() > 0)
		{
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
		
	}

	@Override
	public String toString()
	{
		return "Monster [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "]";
	}

	public String getName()
	{
		return name;
	}

	public int getHitPoints()
	{
		return hitPoints;
	}

	public int getStrength()
	{
		return strength;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}

	public void setStrength(int strength)
	{
		this.strength = strength;
	}
}