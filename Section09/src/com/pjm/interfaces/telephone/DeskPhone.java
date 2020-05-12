package com.pjm.interfaces.telephone;

public class DeskPhone implements ITelephone
{
	private int myPhoneNumber;
	private boolean isRinging;
	
	public DeskPhone(int number)
	{
		this.myPhoneNumber = number;
	}
	
	@Override
	public void powerOn()
	{
		System.out.println("Desk phone does not have a power button.");
	}

	@Override
	public void dial(int phoneNumber)
	{
		System.out.println("Dialing " + phoneNumber + " via desk phone.");
	}

	@Override
	public void answer()
	{
		if(isRinging)
		{
			System.out.println("Answer desk phone.");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber)
	{
		if(phoneNumber == myPhoneNumber)
		{
			isRinging = true;
			System.out.println("Ringing.");
		}
		else
		{
			isRinging = false;
		}
		
		return isRinging;
	}

	@Override
	public boolean isRinging()
	{
		return isRinging;
	}

}
