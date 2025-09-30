package com.features;

import com.library.Book;
import com.library.Library;
import com.library.Member;

public class AddReturn {
	
	Book book = new Book();
	Member member = new Member();
	
	public String addBook(String title,String author, int ISBN) {
		
		return title + " book added to the library";
		
	}
	
	public String borrowBook() {
		if(book.isAvailable()) {
			member.bo
		}
	}

}
