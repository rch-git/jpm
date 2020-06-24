package com.jpm.generics.sportsteam;

public class America implements ICountry
{
	private String countryName;
	
	public America()
	{
		this.countryName = "United States of America";
	}
	
	@Override
	public String getCountry()
	{
		// TODO Auto-generated method stub
		return this.countryName;
	}

}
