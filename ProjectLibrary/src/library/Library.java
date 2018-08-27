package library;

import java.util.ArrayList;
import java.util.Comparator;

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
	
	public String presentBorrow()
	{
		int sumPresent = 0;
		int sumTotal = 0;
		for(Book b : books)
		{
			if(b.isStatus() == true)
			{
				sumPresent += 1;
			}
			sumTotal += b.getManyBorrow();
		}
		return String.format("Present boorow books : " + sumPresent
				+ "total number of borrow : " + sumTotal);

	}
	
}
