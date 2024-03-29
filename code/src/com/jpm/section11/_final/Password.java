package com.jpm.section11._final;

public class Password
{
	private static final int key = 123456;
	private final int encryptedPassword;
	
	public Password(int password)
	{
		this.encryptedPassword = encryptDecrypt(password);
	}
	
	private int encryptDecrypt(int password)
	{
		return password ^ key;
	}
	
	public final void storePAssword()
	{
		System.out.println("Saving password as " + this.encryptedPassword);
	}
	
	public boolean letMeIn(int password)
	{
		if(encryptDecrypt(password) == this.encryptedPassword)
		{
			System.out.println("Welcome.");
			return true;
		}
		else
		{
			System.out.println("No.");
			return false;
		}
	}
}
