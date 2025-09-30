package com.player;

import java.util.List;

public class MusicPlayer {

	private List<Song> allSongs;
	private List<Playlist> playlists;
	
	public void addSong(Song song) {
		System.out.println("Song Added");
	}
	public void updateSong(String Song) {
		
	}
	public void deleteSong(String song) {
		System.out.println("Song deleted");
	}
	public void displayAllSongs() {
		System.out.println("Song list");
	}
	public void createPlaylist(String song) {
		System.out.println("Playlist created");
	}
	public void addSongToPlaylist(String Song) {
		System.out.println("Song added to playlist");
	}
	public void deletePlaylist(String playlistname) {
		System.out.println("Playlist deleted");
	}
	public void playPlaylist(String playlistname) {
		System.out.println("Playing playlist");
	}
	public void getPlaylist(String playlistname) {
		System.out.println("getting playlist");
	}
	
	public void displayAllPlaylists() {
		System.out.println("All playlists");
	}
}
