package com.jpm.generics.sportsteam;

public class Mexico implements ICountry
{
	private String countryName;
	
	public Mexico()
	{
		this.countryName = "Mexico";
	}
	
	@Override
	public String getCountry()
	{
		// TODO Auto-generated method stub
		return this.countryName;
	}

}
