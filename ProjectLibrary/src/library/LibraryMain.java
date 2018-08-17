package library;

import library.Book.BookType;

/**
 * projekt library
 * @author Olejnik
 *
 */
public class LibraryMain {
	
	public static void main(String[] args)
	{
		Book b = new Book(111, "MasterChef", "Wojtek", "Wielki", 2016, BookType.COOKBOOK, false, 0);

		System.out.println(b);
	}

}
