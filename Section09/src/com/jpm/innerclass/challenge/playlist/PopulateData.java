package com.jpm.innerclass.challenge.playlist;

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
		
		Album a = new Album("a");
		a.addSongs("a1", 10);
		a.addSongs("a2", 10);
		a.addSongs("a3", 10);
		a.addSongs("a4", 10);
		a.addSongs("a1", 10);
		
		Album b = new Album("b");
		b.addSongs("b1", 10);
		b.addSongs("b2", 10);
		b.addSongs("b3", 10);
		b.addSongs("b4", 10);
		b.addSongs("b1", 10);
		
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
