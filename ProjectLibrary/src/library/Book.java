package library;


import java.util.*;

public class Book {
	
	enum BookType {AUTOBIOGRAPHY, CLASSIC, COMEDY, COOKBOOK,
		CRIME, DRAMA, ENCYCLOPEDIA, FANTASY, NOVEL};
	
	private int id;
	private String title;
	private String autorName;
	private String autorSurname;
	private int date;
	private EnumSet<BookType> typeBook;
	private boolean status = true; //true - yes, false - not
	private int manyBorrow;
	private int devoted;
			

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
	public Book(int id, String t, String aName, String aSurname, int d, BookType tBook,
				boolean s, int b, int de)
	{
		this.id = id;
		this.title = t;
		this.autorName = aName;
		this.autorSurname = aSurname;
		this.date = d;
		this.typeBook = EnumSet.of(tBook);
		this.status = s;
		this.manyBorrow = b;
		this.devoted = de;
	}

	@Override
	public String toString()
	{
		return "Id book : " + id + "\nTitle book : " + title + "\nAutor name : "
				+ autorName + " " + autorSurname + "\n Publication date : "
				+ date + "\n Type book : " + typeBook + "\nStatus boorow : "
				+ status + "\nThe number of boorow : " + manyBorrow;
	}
	
	public void addBook(String t, String aName, String aSurname, int d, BookType tBook,
				boolean s, int b, int de)
	{
		Random r = new Random();
		this.id = r.nextInt(10000) + 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Title book : ");
		this.title = input.nextLine();
	}
}

