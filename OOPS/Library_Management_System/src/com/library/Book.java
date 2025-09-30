package com.library;

public class Book {
	
	private String title;
	
	private String author;
	
	private int ISBN;
	
	private boolean isAvailable;

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public Book(String title, String author, int iSBN) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}
	
	public Book() {
		
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + "]";
	}
	
	

}
