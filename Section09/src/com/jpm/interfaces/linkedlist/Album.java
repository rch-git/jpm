package com.jpm.interfaces.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Album
{
	private String albumName;
	private List<Song> songs = new ArrayList<Song>();
	
	public String getAlbumName()
	{
		return albumName;
	}
	public List<Song> getSongs()
	{
		return songs;
	}
	
//	public void setAlbumName(String albumName)
//	{
//		this.albumName = albumName;
//	}
	
//	public void setSongs(ArrayList<Song> songs)
//	{
//		this.songs = songs;
//	}
	
	public void addSongs(String songName, int duration)
	{
		int position = songLocation(songName);
		if(position < 0)
		{
			Song s = new Song(songName, duration);
			this.songs.add(s);
		}
		else
		{
			System.out.println(songName + " is already in the album: " + this.albumName);
		}
	}
	
	public Album(String albumName, List<Song> songs)
	{
		super();
		this.albumName = albumName;
		this.songs = songs;
	}
	
	private int songLocation(String songName)
	{
		int position = -1;
		
		for(int i = 0; i < this.songs.size(); i++)
		{
			if(this.songs.get(i).getSongName().equalsIgnoreCase(songName))
			{
				position = i;
			}
		}
		
		return position;
	}
}
