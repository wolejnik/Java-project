package library;

import java.util.ArrayList;

import library.Book.BookEnum;

public class Library {

	ArrayList<Book> books = new ArrayList<>();
	int item = books.size();
	

	/**
	 * 
	 * @return books how many books are in library
	 */
	public int bookInLibrary()
	{
		return books.size();
	}
	
	
}
