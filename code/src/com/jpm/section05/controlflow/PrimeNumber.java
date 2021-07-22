package com.jpm.section05.controlflow;

public class PrimeNumber
{

	public static void main(String[] args)
	{
		 boolean isPrime = isPrime(6);
		 System.out.println(isPrime);
		 
		 for (int i = 0; i < 50; i++)
		 {
			 if (isPrime(i))
			 {
				 System.out.println("Number = " + i);
			 }
			 
		 }

	}
	
	public static boolean isPrime(int number)
	{	
		if (number == 1 || number == 0)
		{
			return false;
		}
		else
		{
			for (int i = 2; i <= number/2; i++)
			{
				if (number % i == 0)
				{
					return false;
				}	
			}
			
			return true;
		}
	}

}
