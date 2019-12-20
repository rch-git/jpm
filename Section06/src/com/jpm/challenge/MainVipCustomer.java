package com.jpm.challenge;

public class MainVipCustomer
{

	public static void main(String[] args)
	{
		VipCustomer vip = new VipCustomer();
		PrintVipValues(vip);
		
		VipCustomer vip2 = new VipCustomer(1000, "test@test.com");
		PrintVipValues(vip2);
		
		VipCustomer vip3 = new VipCustomer("test", 9999, "test1@test.com");
		PrintVipValues(vip3);
	}

	public static void PrintVipValues(VipCustomer vip)
	{
		System.out.println("Name: " + vip.getName());
		System.out.println("Email: " + vip.getEmail());
		System.out.println("Credit Limit: " + vip.getCreaitLimit());
	}
}
