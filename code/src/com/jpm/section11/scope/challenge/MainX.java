package com.jpm.section11.scope.challenge;

import java.util.Scanner;

public class MainX
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		X x = new X(new Scanner(System.in));
		x.x();
	}
}
