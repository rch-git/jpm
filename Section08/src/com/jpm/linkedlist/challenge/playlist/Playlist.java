package com.jpm.linkedlist.challenge.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist
{
	private ArrayList<Album> albums = new ArrayList<Album>();
	private String playListName;
	private LinkedList<Song> songsPlayList = new LinkedList<Song>();
	
	public ArrayList<Album> getAlbums()
	{
		return albums;
	}
	public String getPlayListName()
	{
		return playListName;
	}
	
	public LinkedList<Song> getSongPlayList()
	{
		return this.songsPlayList;
	}
	
	public void addAlbums(Album album)
	{
		int position = albumLocation(album.getAlbumName());
		if(position < 0)
		{
			this.albums.add(album);
			ArrayList<Song> songsInAlbum = album.getSongs();
			for(int i = 0; i < songsInAlbum.size(); i++)
			{
				this.songsPlayList.add(songsInAlbum.get(i));
			}
		}
		else
		{
			System.out.println(album.getAlbumName() + " already exists.");
		}
	}
	public void setPlayListName(String playListName)
	{
		this.playListName = playListName;
	}
	
	private int albumLocation(String albumName)
	{
		int position = -1;
		for(int i = 0; i < this.albums.size(); i++)
		{
			if(this.albums.get(i).getAlbumName().equalsIgnoreCase(albumName))
			{
				position = i;
			}
		}
		return position;
	}
	
	public void addSongs(Song s)
	{
		this.songsPlayList.add(s);
	}
}
