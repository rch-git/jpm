package com.jpm.section07.composition;

public class Computer
{
	public static void main(String[] args) throws InterruptedException
	{
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("2208", "Dell", "240", dimensions);
		
		Monitor monitor = new Monitor("27 inch", "Acer", 27, new Resolution(2560, 1440));
		
		Motherboard motherboard = new Motherboard("UDX", "Asus", 4, 6, "v 2.44");
		
		PC thePC = new PC(theCase, motherboard, monitor);
		thePC.getTheCase().pressPowerButton();
		thePC.getMonitor().drawPixelAt(1500, 1200, "red");
		thePC.getMb().loadProgram("Windows 10");
		
		thePC.powerUp();
	}
}