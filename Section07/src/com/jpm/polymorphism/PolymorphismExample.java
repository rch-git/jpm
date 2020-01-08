package com.jpm.polymorphism;

import java.util.Random;

public class PolymorphismExample
{
	public static void main(String[] args)
	{
//		for (int i = 0; i < 11; i++)
//		{
//			Movie m = randomMovie();
//			System.out.println("Movie #" + (i+1) + " is: " + m.getName() + ", \nPlot: " + m.plot());
//			System.out.println("----");
//		}
		
		Movie m1 = new Jaws();
		System.out.println("Name: " + m1.getName() + ", Plot: " + m1.plot());
		Movie m2 = new IndependenceDay();
		System.out.println("Name: " + m2.getName() + ", Plot: " + m2.plot());
		Movie m3 = new MazeRunner();
		System.out.println("Name: " + m3.getName() + ", Plot: " + m3.plot());
		Movie m4 = new StarWars();
		System.out.println("Name: " + m4.getName() + ", Plot: " + m4.plot());
		Movie m5 = new Forgetable();
		System.out.println("Name: " + m5.getName() + ", Plot: " + m5.plot());
	}


	public static Movie randomMovie()
	{
		Random r = new Random();
		int randomNumber = r.nextInt(5) + 1;
		System.out.println("Random number generated: " + randomNumber);
		switch (randomNumber)
		{
			case 1: 
				return new Jaws();
			case 2: 
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5: 
				return new Forgetable();
			default:
				return null;
		}
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

	public String getName()
	{
		return name;
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

class Forgetable extends  Movie
{
	public Forgetable()
	{
		super("Forgetable");
	}
	
//	No plot method
}