package com.jpm.section06.inheritance;

public class MainHouse
{
	public static void main(String[] args)
	{
		House blueHouse = new House("blue");
		System.out.println("blueHouse.getColor: " + blueHouse.getColor());
		
		House anotherHouse = blueHouse;
		System.out.println("anotherHouse.getColor: " + anotherHouse.getColor());
		
		anotherHouse.setColor("red");
		
		System.out.println("blueHouse.getColor: " + blueHouse.getColor());
		System.out.println("anotherHouse.getColor: " + anotherHouse.getColor());
		
		House greenHouse = new House("green");
		System.out.println("greenHouse.getColor: " + greenHouse.getColor());
		anotherHouse = greenHouse;
		
		System.out.println("blueHouse.getColor: " + blueHouse.getColor());
		System.out.println("anotherHouse.getColor: " + anotherHouse.getColor());
		System.out.println("greenHouse.getColor: " + greenHouse.getColor());
	}
}