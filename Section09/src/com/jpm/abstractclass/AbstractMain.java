package com.jpm.abstractclass;

public class AbstractMain
{

	public static void main(String[] args)
	{
		Dog dog = new Dog("German shepard.");
		dog.breathe();
		dog.eat();
		
		Parrot parrot = new Parrot("Two face");
		parrot.breathe();
		parrot.eat();
		parrot.fly();
		
		Penguin penguin = new Penguin("penguin1");
		penguin.breathe();
		penguin.eat();
		penguin.fly();
	}
}
