package com.jpm.section11.scope.challenge;

import java.util.Scanner;

/**
 * Solution for Scope challenge. Lecture 147
 * @author Ravi
 *
 */

public class X
{
	private int x;
	public X(Scanner x)
	{
		this.x = x.nextInt();
	}
	
	public void x()
	{
		for(int x = 1; x < 13; x++)
		{
			System.out.println(x * this.x);
		}
	}
}