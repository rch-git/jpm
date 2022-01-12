package com.jpm.section09.pjm.interfaces.telephone;

public interface ITelephone
{
	public void powerOn();
	
	public void dial(int phoneNumber);
	
	void answer();
	
	boolean callPhone(int phoneNumber);
	
	boolean isRinging();
}
