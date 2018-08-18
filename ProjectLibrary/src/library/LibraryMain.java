package library;

import library.Book.BookEnum;

/**
 * projekt library
 * @author Olejnik
 *
 */
public class LibraryMain {
	
	public static void main(String[] args)
	{
		
		//tab object class Book
		Book[] book = new Book[10];
		for(int i=0; i < book.length; i++)
			book[i] = new Book();
		
		book[0].createBook(100, "The Lord of the Rings", "J.R.R.", "Tolkien", 1999, BookEnum.NOVEL, true, 0, 0);
		
		System.out.println(book[0]);
		
		book[1].addBook();
		
		System.out.println("-----------------");
		System.out.println(book[1]);
		
		book[0].getBorrow();
		
	}

}
