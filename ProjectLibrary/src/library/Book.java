package library;

import java.util.Random;
import java.util.Scanner;

import library.Book.BookEnum;

public class Book{

	enum BookEnum {AUTOBIOGRAPHY, CLASSIC, COMEDY, COOKBOOK,
		CRIME, DRAMA, ENCYCLOPEDIA, FANTASY, NOVEL};
	
	private int id;
	private String title;
	private String autorName;
	private String autorSurname;
	private int date;
	private BookEnum typeBook;
	private boolean status = true; //true - yes, false - not
	private int manyBorrow;
	private int devoted;
	
	public Book()
	{
		this.id = 0	;
		this.title = " ";
		this.autorName = " ";
		this.autorSurname = " ";
		this.date = 0000;
		this.typeBook = null;
		this.status = false;
		this.manyBorrow = 0;
		this.devoted = 0;
	}
	
	
	/**
	 * create book in library
	 * @param id id book
	 * @param t title book
	 * @param aName autor name book
	 * @param aSurname autor surname book
	 * @param d age publication date
	 * @param tBook list type book's
	 * @param s status borrow
	 * @param b the number of boorow
	 * @param d the muber of devoted
	 */
	
	public void createBook(int id, String t, String aName, String aSurname, int d, BookEnum tBook,
			boolean s, int b, int de)
{
	this.id = id;
	this.title = t;
	this.autorName = aName;
	this.autorSurname = aSurname;
	this.date = d;
	this.typeBook = tBook;
	this.status = s;
	this.manyBorrow = b;
	this.devoted = de;
}
	
	@Override
	public String toString()
	{
		return "Id book : " + id + "\nTitle book : " + title + "\nAutor name : "
				+ autorName + " " + autorSurname + "\nPublication date : "
				+ date + "\nType book : " + typeBook + "\nStatus boorow : "
				+ status + "\nThe number of boorow : " + manyBorrow
				+ "\nThe number of return : " + devoted;
	}
	
	public void addBook()
	{
		
		Random r = new Random();
		this.id = r.nextInt(100) + 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Title book : ");
		this.title = input.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Autor name book : ");
		this.autorName = input2.nextLine();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Autor surname book : ");
		this.autorSurname = input3.nextLine();
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("Publication date : ");
		this.date = input4.nextInt();
		
		Scanner input5 = new Scanner(System.in);
		System.out.println("Type book : ");
		String typeBookSt = input5.next();
		//convert String to enum
		BookEnum typebook = BookEnum.valueOf(typeBookSt.toUpperCase());
		this.typeBook = typebook;
		
		this.status = false;
		this.manyBorrow = 0;
		this.devoted = 0;
		
	}
	
	/**
	 * 
	 * @param ebook edit book
	 */
	public void editBook( Book ebook) {
		System.out.println(ebook);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Select value to edit book (Name, Surname, Title, Date, Type): ");
		String choice = in.nextLine();
		
		switch(choice)
		{
		case "Name" :
			Scanner inName = new Scanner(System.in);
			System.out.println("Autor name book : ");
			this.autorName = inName.nextLine();
			break;
		case "Surname" :
			Scanner inSurname = new Scanner(System.in);
			System.out.println("Autor surname book : ");
			this.autorSurname = inSurname.nextLine();
			break;
		case "Title" :
			Scanner inTitle = new Scanner(System.in);
			System.out.println("Title book : ");
			this.title = inTitle.nextLine();
			break;
		case "Date" :
			Scanner inDate = new Scanner(System.in);
			System.out.println("Publication date : ");
			this.date = inDate.nextInt();
			break;
			
		case "Type" :
			Scanner inType = new Scanner(System.in);
			System.out.println("Type book : ");
			String typeBookSt = inType.next();
			//convert String to enum
			BookEnum typebook = BookEnum.valueOf(typeBookSt.toUpperCase());
			this.typeBook = typebook;
			break;
		}
		System.out.println(ebook);
	}
	
	/**
	 * 
	 * @return true if is borrowed, false if ins't borrowed
	 */
	public boolean getBorrow() 
	{
		if (status == true)
		{
			System.out.println("Book is borrowed");
			return true;
		}
		System.out.println("Book isn'y borrowed");
		return false;
	}
	
	public void borrowBook()
	{
		status = true;
		manyBorrow += 1;
	}
	
	public void retuenBook()
	{
		status = false;
		devoted += 1;
	}
	
}
