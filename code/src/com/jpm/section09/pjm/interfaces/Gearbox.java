package com.jpm.section09.pjm.interfaces;

public class Gearbox
{
	private boolean clutchIsIn;
	
	private void operateClutch(String inOrOut)
	{
		this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
	}
}
