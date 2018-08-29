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
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		lib.books.add(new Book());
		
		
		lib.books.get(0).createBook(12, "Wiedzmin Krew elfów", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		lib.books.get(1).createBook(11, "Pan Tadeusz", "Adam", "Mickiewicz", 2018, BookEnum.NOVEL, false, 0, 0);
		lib.books.get(2).createBook(20, "Zwierzeta", "Klaudia", "XXXXX", 2005, BookEnum.ENCYCLOPEDIA, false, 0, 0);
		lib.books.get(3).createBook(6, "Jadro ciemnosci", "yyy", "kkk", 2010, BookEnum.DRAMA, true, 0, 0);
		lib.books.get(4).createBook(20, "Zwierzeta w Akcji", "Klaudia", "ZZZZZ", 2006, BookEnum.ENCYCLOPEDIA, false, 0, 0);
		lib.books.get(5).createBook(13, "Wiedzmin Ostatnie ¿yczenie", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		lib.books.get(6).createBook(14, "Wiedzmin Miecz przeznaczenia", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		lib.books.get(7).createBook(15, "Wiedzmin Czas pogardy", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		lib.books.get(8).createBook(16, "Wiedzmin Chrzest ognia", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, true, 0, 0);
		lib.books.get(9).createBook(17, "Wiedzmin Wie¿a Jaskó³ki", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		lib.books.get(10).createBook(16, "Wiedzmin Pani Jeziora", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, true, 0, 0);
		lib.books.get(11).createBook(17, "Wiedzmin Sezon Burz", "Andrzej", "Sapkowski", 1994, BookEnum.FANTASY, false, 0, 0);
		
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
		
		System.out.println("---------------------");
		
		lib.searchTitle();
		lib.searchName();
		
	}
	
	
}
