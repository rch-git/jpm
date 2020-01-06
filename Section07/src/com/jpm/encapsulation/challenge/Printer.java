package com.jpm.encapsulation.challenge;

public class Printer
{
	private double tonerLevel;
	private int numOfPagesPrinted = 0;
	private boolean isDuplex;
	
	public Printer(int tonerLevel, int numOfPagesPrinted, boolean isDuplex)
	{
		this.tonerLevel = tonerLevel;
		this.numOfPagesPrinted = numOfPagesPrinted;
		this.isDuplex = isDuplex;
	}

	public double getTonerLevel()
	{
		return tonerLevel;
	}

	public int getNumOfPagesPrinted()
	{
		return numOfPagesPrinted;
	}

	public boolean isDuplex()
	{
		return isDuplex;
	}
	
	public void fillToner(int addToner)
	{
		System.out.println("Current toner level: " + this.tonerLevel + "%.");
		System.out.println("Adding toner.");
				
		if (this.tonerLevel + addToner > 100)
		{
			this.tonerLevel = 109;
			System.out.println("Excess toner: " + ((this.tonerLevel + addToner) - 100));
			System.out.println("New toner level: " + this.tonerLevel + "%");
		}
		else
		{
			this.tonerLevel += addToner;
			System.out.println("New toner level: " + this.tonerLevel + "%");
		}
	}
	
	public void print(int pages)
	{
		if(!isDuplex)
		{
			System.out.println("Printing " + pages + "(s).");
			this.numOfPagesPrinted += pages;
			System.out.println("Number of pages printed so far: " + this.numOfPagesPrinted);
			updateToner(pages);
		}
		else
		{
			int numberOfPagesToPrint = (pages / 2) + (pages % 2);
			this.numOfPagesPrinted += numberOfPagesToPrint;
			System.out.println("Number of pages printed so far: " + this.numOfPagesPrinted);
			updateToner(numberOfPagesToPrint);
		}
	}
	
	private void updateToner(int pages)
	{
		this.tonerLevel = this.tonerLevel - (this.tonerLevel * 100) / 2000;
		
	}
}