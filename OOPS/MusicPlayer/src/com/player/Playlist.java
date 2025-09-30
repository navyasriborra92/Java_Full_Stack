package com.player;

import java.util.List;

public class Playlist implements Playable{

	
	private int playlistId;
	private String playlistName;
	private List<Song> songList;
	
	@Override
	public void play(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play(int songId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause(int songId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(String title) {
		// TODO Auto-generated method stub
		
	}
	
	public void addSong(Song song) {
		System.out.println("Song added");
	}
	
	public void removeSong(String songname) {
		System.out.println(songname + " Song removed");
	}
	
	public void displaySongs() {
		System.out.println("List of Songs");
	}

}
