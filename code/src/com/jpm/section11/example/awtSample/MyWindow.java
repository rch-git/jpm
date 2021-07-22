package com.example.awtSample;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyWindow(String title)
	{
		super(title);
		setSize(500, 140);
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		
	}

	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paint(g);
		
		Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
		Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
		g.setFont(sansSerifLarge);
		g.drawString("JPM", 60, 60);
		g.setFont(sansSerifSmall);
		g.drawString("by Ravi", 60, 100);
	}
}
