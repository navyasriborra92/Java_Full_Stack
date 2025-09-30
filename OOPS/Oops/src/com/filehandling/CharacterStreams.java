package com.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
	
	public static void main(String[] args) throws IOException {
		CharacterStreams cs = new CharacterStreams();
		cs.readfile();
		cs.writefile();
	}
	
	public void readfile() throws IOException {
		File file = new File("/Users/navyasriborra/Documents/August2024/pdf_to_mp3.txt");
		FileReader fr = null;
		try {
			 fr = new FileReader(file);
			 int temp;
			 while((temp = fr.read())!= -1){
				 System.out.print((char)temp);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fr.close();
		}
	}
	public void writefile() throws IOException {
		File file = new File("/Users/navyasriborra/Documents/August2024/pdf_to_mp3.txt");
		File file2 = new File("/Users/navyasriborra/Documents/August2024/filewriter.txt");
		FileReader fr = null;
		FileWriter fw = null;
		try {
			 fr = new FileReader(file);
			 fw = new FileWriter(file2);
			 int temp;
			 while((temp = fr.read())!= -1){
				 fw.write(temp);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fr.close();
			fw.close();
		}
	}

}
