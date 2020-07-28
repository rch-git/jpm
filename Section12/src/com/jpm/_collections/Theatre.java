package com.jpm._collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre
{
	private final String theatreNanme;
	private List<Seat> seats = new ArrayList<>();
	
	public Theatre(String theatreNanme, int numRows, int seatsPerRow)
	{
		super();
		this.theatreNanme = theatreNanme;
		int lastRow = 'A' + (numRows - 1);
		for(char row = 'A'; row <= lastRow; row++)
		{
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++)
			{
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}

	public String getTheatreNanme()
	{
		return theatreNanme;
	}
	
	public boolean reserveSeat(String seatNumber)
	{
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if(foundSeat >= 0)
		{
			return seats.get(foundSeat).reserve();
		}
		else
		{
			System.out.println("There is no seat: " + seatNumber);
			return false;
		}
		
//		ineffient way of seatching
//		for(Seat seat : seats)
//		{
//			System.out.print(".");
//			if(seat.getSeatNumber().equalsIgnoreCase(seatNumber))
//			{
//				requestedSeat = seat;
//				break;
//			}
//		}
//		if(requestedSeat == null)
//		{
//			System.out.println("There is no seat: " + seatNumber);
//			return false;
//		}
//		
//		return requestedSeat.reserve();
		
		
		
//		Actual binary search for seat number
//		int low = 0;
//		int high = seats.size()-1;
//		
//		while(low <= high)
//		{
//			int mid = (low + high) / 2;
//			Seat midVal = seats.get(mid);
//			int cmp = midVal.getSeatNumber().compareToIgnoreCase(seatNumber);
//			if(cmp < 0)
//			{
//				low = mid + 1;
//			}
//			else if(cmp > 0)
//			{
//				high = mid - 1;
//			}
//			else
//			{
//				return seats.get(mid).reserve();
//			}
//		}
//		System.out.println("There is no seat: " + seatNumber);
//		return false;
		 
	}
	
	public void getSeats()
	{
		for(Seat seat : seats)
		{
			System.out.println(seat.getSeatNumber());
		}
	}
	
	private class Seat implements Comparable<Seat>
	{
		private final String seatNumber;
		private boolean reserved = false;
		
		public Seat(String seatNumber)
		{
			super();
			this.seatNumber = seatNumber;
		}
		
		public boolean reserve()
		{
			if(!this.reserved)
			{
				this.reserved = true;
				System.out.println("Seat: " + seatNumber + " reserved.");
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean cancel()
		{
			if(this.reserved)
			{
				this.reserved = false;
				System.out.println("Seat: " + seatNumber + " canceled.");
				return true;
			}
			else
			{
				return false;
			}
		}

		public String getSeatNumber()
		{
			return seatNumber;
		}

		@Override
		public int compareTo(Seat seat)
		{
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
	}
}