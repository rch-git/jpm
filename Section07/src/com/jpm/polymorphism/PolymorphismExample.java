package com.jpm.polymorphism;

public class PolymorphismExample
{
	public static void main(String[] args)
	{
		
	}
}

class Movie
{
	private String name;

	public Movie(String name)
	{
		this.name = name;
	}
	
	public String plot()
	{
		return "No plot here.";
	}
}

class Jaws extends Movie
{
	public Jaws()
	{
		super("Jaws");
	}
	
	public String plot()
	{
		return "Shark eats humans";
	}
}

class IndependenceDay extends  Movie
{
	public IndependenceDay()
	{
		super("Independence Day");
	}
	
	public String plot()
	{
		return "Alien invasion";
	}
}

class MazeRunner extends  Movie
{
	public MazeRunner()
	{
		super("Maze Runner");
	}
	
	public String plot()
	{
		return "Maze running";
	}
}

class StarWars extends  Movie
{
	public StarWars()
	{
		super("Star Wars");
	}
	
	public String plot()
	{
		return "Space battles";
	}
}