package com.jpm.encapsulation.solution;

public class MainPrinter
{

	public static void main(String[] args)
	{
		Printer printer = new Printer(50, true);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(5);
		System.out.println("Pages printed was: " + pagesPrinted + " new total print count for the printer: " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(3);
		System.out.println("Pages printed was: " + pagesPrinted + " new total print count for the printer: " + printer.getPagesPrinted());
	}
}
