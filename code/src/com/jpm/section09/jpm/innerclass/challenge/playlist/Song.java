package com.jpm.section09.jpm.innerclass.challenge.playlist;

public class Song
{
	private String songName;
//	duration in seconds
	private int duration;
	
	public String getSongName()
	{
		return songName;
	}
	public int getDuration()
	{
		return duration;
	}
	public void setSongName(String songName)
	{
		this.songName = songName;
	}
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	
	public Song(String songName, int duration)
	{
		super();
		this.songName = songName;
		this.duration = duration;
	}
}
