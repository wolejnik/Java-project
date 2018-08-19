package library;

import library.Book.BookEnum;

public class LibraryMain {

	public static void main(String[] args)
	{
		Library lib = new Library();
		lib.books.add(new Book());
		lib.books.add(new Book());
		
		lib.books.get(0).createBook(12, "Wiedzmin Krew elfów", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		System.out.println(lib.books.get(0));
		System.out.println(lib.bookInLibrary());
		//lib.books.get(1).addBook();
		//System.out.println(lib.books.get(1));
		
		System.out.println("---------------------");
		
		lib.books.get(0).borrowBook();
		System.out.println(lib.books.get(0));
		lib.books.get(0).retuenBook();
		System.out.println(lib.books.get(0));
	}
	
	
}
