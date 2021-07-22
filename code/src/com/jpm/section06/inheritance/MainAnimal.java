package com.jpm.section06.inheritance;

public class MainAnimal
{
	public static void main(String[] args)
	{
		Animal animal = new Animal("Animal", 1, 1, 1, 5);
		Dog dog = new Dog("dog", 8, 20, 1, 20, "silky");
		
		dog.eat();
		dog.move(10);	
		
		Fish fish = new Fish("catfish", 1, 1, 1, 2, 4);
		
		fish.swim(10);
	}
}
 