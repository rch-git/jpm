package com.jpm.section06.controlflow._switch;

public class SwitchMain
{
	public static void main(String[] args)
	{
		int value = 5;
//		if (value ==1)
//		{
//			System.out.println("Value was 1");
//		}
//		else if (value == 2)
//		{
//			System.out.println("Value was 2");
//		}
//		else
//		{
//			System.out.println("Value: " + value);
//		}
		
		
		switch(value)
		{
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			default:
				System.out.println("Printing default value: " + value);
				break;
		}
	}
	
	/*
	 * Syntax for switch statement
	 * 
	 * switch(value)
	 * {
	 * 	case x: 
	 * 		some code for x
	 * 		break;
	 * 	case y:
	 * 		some code for y
	 * 		break;
	 * 	default:
	 * 		some code for default
	 * 		break;
	 * }
	 */
	
	
}
