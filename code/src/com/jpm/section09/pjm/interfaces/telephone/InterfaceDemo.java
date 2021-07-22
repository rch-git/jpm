package com.jpm.section09.pjm.interfaces.telephone;

public class InterfaceDemo
{

	public static void main(String[] args)
	{
		ITelephone myPhone;
		myPhone = new DeskPhone(123456);
		myPhone.powerOn();
		myPhone.callPhone(123456);
		myPhone.answer();
		
		myPhone = new MobilePhone(123456789);
		myPhone.powerOn();
		myPhone.callPhone(123456789);
		myPhone.answer();
	}

}
