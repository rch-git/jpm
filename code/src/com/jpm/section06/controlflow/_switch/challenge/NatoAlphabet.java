package com.jpm.section06.controlflow._switch.challenge;

public class NatoAlphabet
{
	public static void main(String[] args)
	{
		char c = 'X';
		System.out.println("NATO Alphabet: " + natoAlphabet(c));
	}
	
	public static String natoAlphabet (char c)
	{
		switch(c)
		{
			case 'A':
				return "Able";
			case 'B':
				return "Baker";
			case 'C':
				return "Charlie";
			case 'D':
				return "Dog";
			case 'E':
				return "Easy";
			default:
				return "BAD";
			
		}
	}
}
