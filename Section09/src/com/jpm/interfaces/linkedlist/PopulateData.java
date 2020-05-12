package com.jpm.interfaces.linkedlist;

import java.util.ArrayList;

public class PopulateData
{
	public static ArrayList<Song> createSingles()
	{
		ArrayList<Song> songs = new ArrayList<Song>();
		Song s1 = new Song("s1", 10);
		songs.add(s1);
		Song s2 = new Song("s2", 20);
		songs.add(s2);
		return songs;
	}
	
	public static ArrayList<Album> createAlumbs()
	{
		ArrayList<Album> albums = new ArrayList<Album>();
		ArrayList<Song> songList1 = new ArrayList<Song>();
		Song a1 = new Song("a1", 10);
		Song a2 = new Song("a2", 10);
		Song a3 = new Song("a3", 10);
		Song a4 = new Song("a4", 10);
		
		songList1.add(a1);
		songList1.add(a2);
		songList1.add(a3);
		songList1.add(a4);
		
		Album a = new Album("a", songList1);
		
		ArrayList<Song> songList2 = new ArrayList<Song>();
		Song b1 = new Song("b1", 10);
		Song b2 = new Song("b2", 10);
		Song b3 = new Song("b3", 10);
		Song b4 = new Song("b4", 10);
		
		songList2.add(b1);
		songList2.add(b2);
		songList2.add(b3);
		songList2.add(b4);
		
		Album b = new Album("b", songList2);
		
		albums.add(a);
		albums.add(b);
		
		return albums;
	}
	
	public static Playlist createPlaylist()
	{
		Playlist pl1 = new Playlist();
		
		ArrayList<Song> singles = createSingles();
		ArrayList<Album> albums = createAlumbs();
		
		for(int i = 0; i < singles.size(); i++)
		{
			pl1.addSongs(singles.get(i));
		}
		
		for(int i = 0; i < albums.size(); i++)
		{
			pl1.addAlbums(albums.get(i));
		}
		
		return pl1;
	}
}
