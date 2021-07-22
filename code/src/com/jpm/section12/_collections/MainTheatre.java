package com.jpm.section12._collections;

public class MainTheatre
{

	public static void main(String[] args)
	{
		Theatre theatre = new Theatre("T1", 8, 12);
//		theatre.getSeats();
		
		if(theatre.reserveSeat("h11"))
		{
			System.out.println("Please pay");
		}
		else
		{
			System.out.println("Seat reserved.");
		}
		if(theatre.reserveSeat("h11"))
		{
			System.out.println("Please pay");
		}
		else
		{
			System.out.println("Seat reserved.");
		}
	}

}
