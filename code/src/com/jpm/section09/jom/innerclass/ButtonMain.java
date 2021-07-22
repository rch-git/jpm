package com.jpm.section09.jom.innerclass;

import java.util.Scanner;

import com.jpm.section09.jom.innerclass.Button.OnClickListener;

public class ButtonMain
{
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	private static Button btnPrint2 = new Button("Print2");
	private static Button btnPrint3 = new Button("Print3");

	public static void main(String[] args)
	{
		class ClickListener implements Button.OnClickListener
		{
			public ClickListener()
			{
				System.out.println("I've been attached");
			}
			@Override
			public void onClick(String title)
			{
				System.out.println(title + " was clicked.");
			}
		}
		
//		btnPrint.setOnClickListener(new ClickListener());
		
		btnPrint.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(String title)
			{
				System.out.println(title + " was clicked.(anonymous inner class)");
			}
		});
		
		
		btnPrint2.onClick();
		
		btnPrint3.setOnClickListener(new ClickListener());
		
		listen();
	}
	
	private static void listen()
	{
		boolean quit = false;
		System.out.println("Press 0 (to quit) or 1 to continue.");
		while(!quit)
		{
			int choice = scanner.nextInt();
			switch(choice)
			{
				case 0:
					quit = true;
					break;
				case 1:
					btnPrint.onClick();
					break;
				case 2:
					btnPrint2.onClick();
					break;
				case 3:
					btnPrint3.onClick();
					break;
				default: 
					System.out.println("Try again.");
			}
		}
	}
}
