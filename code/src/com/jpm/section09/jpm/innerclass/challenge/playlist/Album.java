package com.jpm.section09.jpm.innerclass.challenge.playlist;

import java.util.ArrayList;
import java.util.List;


public class Album
{
	private String albumName;
	private SongList songs;
	
	public Album(String albumName)
	{
		super();
		this.albumName = albumName;
		this.songs = new SongList();
	}
	
	public String getAlbumName()
	{
		return albumName;
	}
	public List<Song> getSongs()
	{
		return songs.getSongs();
	}
	
	public void addSongs(String songName, int duration)
	{
		songs.addSongs(songName, duration);
	}
	
	private class SongList
	{
		private List<Song> songs = new ArrayList<Song>();
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
				System.out.println(songName + " is already in the album: " + albumName);
			}
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
		
		public List<Song> getSongs()
		{
			return this.songs;
		}
		
		
	}
	
	
}
