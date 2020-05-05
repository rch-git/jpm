package com.jpm.linkedlist.challenge.playlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlaylistOperations
{
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		Playlist pl = PopulateData.createPlaylist();
//		listAllSongs(pl.getSongPlayList());
		play(pl.getSongPlayList());
		
	}
	
	private static void listAllSongs(LinkedList<Song> songs)
	{
		System.out.println("Songs in playlist: ");
		for(int i = 0; i < songs.size(); i++)
		{
			System.out.println((i + 1) + ". " + songs.get(i).getSongName());
		}
	}
	
	private static void play(LinkedList<Song> s)
	{
		boolean quit = false;
		ListIterator<Song> li = s.listIterator();
		boolean goingForward = true;
		
//		Playing music begins
		printMenu();
		while(!quit)
		{
			System.out.println("Enter option: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option)
			{
				case 0:
					printMenu();
					break;
				case 1:
					if(!goingForward)
					{
						if(li.hasNext())
						{
							li.next();
							goingForward = true;
						}
					}
					if(li.hasNext())
					{
						System.out.println("Now playing: " + li.next().getSongName());
					}
					else
					{
						System.out.println("Reached end of the list.");
						goingForward = false;
					}
					break;
				case 2:
					if(goingForward)
					{
						if(li.hasPrevious())
						{
							li.previous();
							goingForward = false;
						}
					}
					if(li.hasPrevious())
					{
						System.out.println("Now playing: " + li.previous().getSongName());
					}
					else
					{
						System.out.println("Reached beginning of the list.");
						goingForward = true;
					}
					break;
				case 3:
					if(goingForward)
					{
						if(li.hasPrevious())
						{
							li.previous();
							System.out.println("Replaying: " + li.next().getSongName());
						}
						else
						{
//							At the beginning of the list, repeat would play first song
							System.out.println("Replaying: " + li.next().getSongName());
						}
					}
					else
					{
						if(li.hasNext())
						{
							li.next();
							System.out.println("Replaying: " + li.previous().getSongName());
						}
						else
						{
//							At the end of the list, repeat would play last song
							System.out.println("Replaying: " + li.previous().getSongName());
						}
					}
					break;
				case 4:
					listAllSongs(s);
					break;
				case 5:
					System.out.println("Quitting...");
					quit = true;
					break;
				case 6:
					if(li.hasNext())
					{
						li.remove();
						System.out.println("Now playing: " + li.next().getSongName());
					}
					else
					{
						li.remove();
						System.out.println("Now playing: " + li.previous().getSongName());
					}
					
			}
		}
	}
	
	private static void printMenu()
	{
		System.out.println("0. Print menu");
		System.out.println("1. Play next song");
		System.out.println("2. Skip backwards");
		System.out.println("3. Repeat current song");
		System.out.println("4. List all songs");
		System.out.println("5. quit");
		System.out.println("6. Remove current song");
	}
}
