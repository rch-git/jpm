package com.jpm.section08.linkedlist.challenge.playlist.solution;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name, String artist)
	{
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public boolean addSong(String title, double duration)
	{
		if (findSong(title) == null)
		{
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	
	private Song findSong(String title)
	{
		for(Song checkedSong: this.songs)
		{
			if(checkedSong.getTitle().equalsIgnoreCase(title))
			{
				return checkedSong;
			}
		}
		return null;
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> pl)
	{
		int index = trackNumber -1;
		if((index >= 0) && (index <= this.songs.size()))
		{
			pl.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track: " + trackNumber);
		return false;
	}
	
	public boolean addToPlayList(String title, LinkedList<Song> pl)
	{
		Song checkedSong = findSong(title);
		if(checkedSong != null)
		{
			pl.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in this album.");
		return false;
	}
}