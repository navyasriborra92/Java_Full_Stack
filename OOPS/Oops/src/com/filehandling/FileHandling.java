package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {

		FileHandling fh = new FileHandling();
		fh.readFromFile();
		fh.writeFromFile();
	}
	
	public void readFromFile() throws IOException {
		File file = new File("/Users/navyasriborra/Documents/August2024/pdf_to_mp3.txt");
		
		FileInputStream fs = null;
		
		try {
			fs = new FileInputStream(file);
			
			int temp;
			while((temp=fs.read())!= -1) {
				System.out.print((char)temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fs.close();
		}
	}
	
	public void writeFromFile() throws IOException {
		File file = new File("/Users/navyasriborra/Documents/August2024/pdf_to_mp3.txt");
		File file2 = new File("/Users/navyasriborra/Documents/August2024/output.txt");
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		try {
			fs = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			String data = "Hardcode ";
			fos.write(data.getBytes());
			int temp;
			while((temp=fs.read())!= -1) {
				System.out.print((char)temp);
				fos.write(temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fs.close();
			fos.close();
		}
	}

}
