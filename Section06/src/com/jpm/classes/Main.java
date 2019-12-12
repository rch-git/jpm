package com.jpm.classes;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setModel("ABC");
		
		Car[] car3 = new Car[2];
		
		for (int i = 0; i < 2; i++)
		{
			car3[i] = new Car();
			System.out.println("Enter number of doors: ");
			car3[i].setDoors(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Enter model: ");
			car3[i].setModel(scanner.next());
		}
		
		scanner.close();
		
		for (int i = 0; i < 2; i++)
		{
			System.out.println("Car information");
			System.out.println("Model: " + car3[i].getModel());
			System.out.println("Doors: " + car3[i].getDoors());
		}
		
	}

}
