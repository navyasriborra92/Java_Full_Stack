package com.player;

import java.util.Scanner;

public class MenuDrivenApp {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			while(true) {
			System.out.println(" ========= MUSIC PLAYER MENU =========\n"
					+ "1. Add New Song\n"
					+ "2. Update Existing Song\n"
					+ "3. Delete Song\n"
					+ "4. Display All Songs\n"
					+ "5. Create New Playlist\n"
					+ "6. Add Song to Playlist\n"
					+ "7. Display All Playlists\n"
					+ "8. Display Songs in Playlist\n"
					+ "9. Play Song in Playlist\n"
					+ "10. Pause Song in Playlist\n"
					+ "11. Stop Song in Playlist\n"
					+ "12. Exit\n"
					+ "Enter your choice: ");
			sc.next();
			}
		}
	}

}
