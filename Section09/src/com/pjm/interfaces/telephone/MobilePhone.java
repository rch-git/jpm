package com.pjm.interfaces.telephone;

public class MobilePhone implements ITelephone
{
	private int myPhoneNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	public MobilePhone(int number)
	{
		this.myPhoneNumber = number;
	}
	
	@Override
	public void powerOn()
	{
		isOn = true;
		System.out.println("Mobile phone is ON.");
	}

	@Override
	public void dial(int phoneNumber)
	{
		if(isOn)
		{
			System.out.println("Now ringing " + phoneNumber + " via mobile phone.");
		}
		else
		{
			System.out.println("Phone is off.");
		}
		
	}

	@Override
	public void answer()
	{
		if(isRinging)
		{
			System.out.println("Answer mobile phone.");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber)
	{
		if((phoneNumber == myPhoneNumber ) && isOn)
		{
			isRinging = true;
			System.out.println("Mobile phone ringing.");
		}
		else
		{
			System.out.println("Mobile phone is off.");
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