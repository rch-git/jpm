package com.jpm._final;

public class ExtendedPassword extends Password
{
	private int decryptedPassword;
	
	public ExtendedPassword(int password)
	{
		super(password);
		// TODO Auto-generated constructor stub
		this.decryptedPassword = password;
	}

//	@Override
//	public void storePAssword()
//	{
////		Password is being saved as a decrypted Password.class This compromises security 
//		System.out.println("Saving password as " + this.decryptedPassword);
//	}
	
	
}
