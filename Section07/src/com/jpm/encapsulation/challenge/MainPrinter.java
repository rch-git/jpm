package com.jpm.encapsulation.challenge;

public class MainPrinter
{

	public static void main(String[] args)
	{
		Printer printer = new Printer(100, 0, true);
		
		printer.print(5);
		System.out.println("Toner level: " + printer.getTonerLevel());
		printer.fillToner(1);
	}
}
