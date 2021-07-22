package com.jpm.section08.linkedlist.challenge.playlist.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlaylistOps
{
	private static Scanner scanner = new Scanner(System.in);

	private static ArrayList<Album> albums = new ArrayList<Album>();
	
	public static void main(String[] args)
	{
		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("S1", 1.1);
		album.addSong("S2", 1.2);
		album.addSong("S3", 1.3);
		album.addSong("S4", 1.4);
		album.addSong("S5", 1.5);
		album.addSong("S6", 1.6);
		album.addSong("S7", 1.7);
		album.addSong("S8", 1.8);
		album.addSong("S9", 1.9);
		albums.add(album);
		
		album = new Album("For those about to rock", "AC/DC");
		album.addSong("S10", 1.1);
		album.addSong("S11", 1.2);
		album.addSong("S12", 1.3);
		album.addSong("S13", 1.4);
		album.addSong("S14", 1.5);
		album.addSong("S15", 1.6);
		album.addSong("S16", 1.7);
		album.addSong("S17", 1.8);
		album.addSong("S18", 1.9);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		
		albums.get(0).addToPlayList("S1", playList);
		albums.get(0).addToPlayList("S2", playList);
		albums.get(0).addToPlayList("S20", playList); //does not exist
		albums.get(0).addToPlayList("S9", playList);
		albums.get(1).addToPlayList("S10", playList);
		albums.get(1).addToPlayList("S11", playList);
		albums.get(1).addToPlayList("S12", playList);
		albums.get(1).addToPlayList("S15", playList);
		
		play(playList);
		
	}
	
	private static void play(LinkedList<Song> playList)
	{
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0)
		{
			System.out.println("No songs in the playlist.");
			return;
		}
		else
		{
			System.out.println("Now playing: " + listIterator.next().toString());
		}
		
		while(!quit)
		{
			int action = scanner.nextInt();
			switch(action)
			{
				case 0:
					System.out.println("Playlist complete.");
					quit = true;
					break;
				case 1:
					if(!forward)
					{
						if(listIterator.hasNext())
						{
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext())
					{
						System.out.println("Now playing: " + listIterator.next().toString());
					}
					else
					{
						System.out.println("End of the list.");
						forward = false;
					}
					break;
				case 2:
					if(forward)
					{
						if(listIterator.hasPrevious())
						{
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious())
					{
						System.out.println("Now playing: " + listIterator.previous().toString());
					}
					else
					{
						System.out.println("Beginning of the list.");
						forward = true;
					}
					break;
				case 3:
					if(forward)
					{
						if(listIterator.hasPrevious())
						{
							System.out.println("Now replaying: " + listIterator.previous().toString());
							forward = false;
						}
						else
						{
							System.out.println("Start of the list.");
						}
					}
					else
					{
						if(listIterator.hasNext())
						{
							System.out.println("Now replaying: " + listIterator.next().toString());
							forward = true;
						}
						else
						{
							System.out.println("Reached the end of the list.");
						}
						
					}
					break;
				case 4:
					printList(playList);
					break;
				case 5:
					printMenu();
					break;
				case 6:
					if(listIterator.hasNext())
					{
						listIterator.remove();
						listIterator.next();
					}
					else
					{
						listIterator.remove();
						listIterator.previous();
					}
				
			}
		}
	}
	
	private static void printList(LinkedList<Song> playList)
	{
		Iterator<Song> iterator = playList.iterator();
		while(iterator.hasNext())
		{
//			When printing out the iterator via the next() method, toString() is invoked
			System.out.println(iterator.next());
		}
		
	}
	
	private static void printMenu()
	{
		System.out.println("0. quit");
		System.out.println("1. Forward");
		System.out.println("2. Backwards");
		System.out.println("3. repeat");
		System.out.println("4. print list");
		System.out.println("5. print menu");
		System.out.println("6. remove");
	}
}

















