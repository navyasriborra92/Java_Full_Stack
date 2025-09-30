package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileHandling filehandling = new FileHandling();
		try {
		filehandling.openFile();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public void openFile() throws FileNotFoundException {
		File file = new File("/Users/navyasriborra/Documents/u.docx");
		FileInputStream fileinputstream = new FileInputStream(file);
	}

}
