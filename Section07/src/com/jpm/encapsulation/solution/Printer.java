package com.jpm.encapsulation.solution;

public class Printer
{
	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;
	
//	We are leaving the pages printed out of the constructor and initializing the value to 0
	public Printer(int _tonerLevel, boolean isDuplex)
	{
		if(_tonerLevel >= 1 && _tonerLevel <= 100)
		{
			this.tonerLevel = _tonerLevel;
		}
		else
		{
			this.tonerLevel = -1;
		}
		this.isDuplex = isDuplex;
		this.pagesPrinted = 0;
	}
	
	public int addToner(int tonerAmount)
	{
		if(tonerAmount > 0 && tonerAmount <= 100)
		{
			if (this.tonerLevel + tonerAmount > 100)
			{
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		}
		else
		{
			return -1;
		}
	}
	public int printPages(int numPages)
	{
		int pagesToPrint = numPages;
		if(this.isDuplex)
		{
			pagesToPrint = (numPages/2) + (numPages % 2);
			System.out.println("Printing in duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getTonerLevel()
	{
		return tonerLevel;
	}

	public int getPagesPrinted()
	{
		return pagesPrinted;
	}

	public boolean isDuplex()
	{
		return isDuplex;
	}
}
