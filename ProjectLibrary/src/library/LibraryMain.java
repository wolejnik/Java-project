package library;

import java.util.Collections;

import library.Book.BookEnum;

public class LibraryMain {

	public static void main(String[] args)
	{
		Library lib = new Library();
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		
		lib.books.get(0).createBook(12, "Wiedzmin Krew elfów", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		lib.books.get(1).createBook(11, "Pan Tadeusz", "Adam", "Mickiewicz", 2018, BookEnum.NOVEL, false, 0, 0);
		lib.books.get(2).createBook(20, "Zwierzeta", "Klaudia", "XXXXX", 2005, BookEnum.ENCYCLOPEDIA, false, 0, 0);
		lib.books.get(3).createBook(6, "Jadro ciemnosci", "yyy", "kkk", 2010, BookEnum.DRAMA, true, 0, 0);
		//System.out.println(lib.books.get(0));
		//System.out.println(lib.bookInLibrary());
		//lib.books.get(1).addBook();
		//System.out.println(lib.books.get(1));
		
		System.out.println("---------------------");
		
		lib.books.get(0).borrowBook();
		lib.books.get(1).borrowBook();
		//.out.println(lib.books.get(0));
		lib.books.get(0).returnBook();
		lib.books.get(0).borrowBook();
		lib.books.get(1).returnBook();
		//System.out.println(lib.books.get(0));
		
		//Sorting books on Book title
		Collections.sort(lib.books, Book.BookTitleComparator);
		
		for (Book str : lib.books) {
			System.out.println(str);
			System.out.println("---------------------");
		}
		
		System.out.println("---------------------");
		
		System.out.println(lib.presentBorrow());
		
	}
	
	
}
