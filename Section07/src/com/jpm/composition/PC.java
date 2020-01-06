package com.jpm.composition;

public class PC
{
	private Case theCase;
	private Motherboard mb;
	private Monitor monitor;
	
	public PC(Case theCase, Motherboard mb, Monitor monitor)
	{
		this.theCase = theCase;
		this.mb = mb;
		this.monitor = monitor;
	}

	public Case getTheCase()
	{
		return theCase;
	}

	public Motherboard getMb()
	{
		return mb;
	}

	public Monitor getMonitor()
	{
		return monitor;
	}
	
	public void powerUp()
	{
		getTheCase().pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo()
	{
		monitor.drawPixelAt(1200, 50, "yellow");
	}
}
