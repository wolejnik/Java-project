package library;

public class Book {
	
	private int id;
	private String title;
	private String autorName;
	private String autorSurname;
	Range date = new Range(1700, 2018);
	
	public enum Type
	{
		type1 ("BESTSELLER"),
		type2 ("COMIC"),
		type3 ("FAIRY"),
		type4 ("NOVEL"),
		type5 ("POETRY"),
		type6 ("COOKBOOK"),
		type7 ("DRAMA"); 
		
		private String type;
		
		private Type(String s)
		{
			type = s;
		}
		
		public String toString()
		{
			return this.type;
		}
	}

	/**
	 * create book in library
	 * @param id id book
	 * @param t title book
	 * @param aName autor name book
	 * @param aSurname autor surname book
	 * @param d age publication date
	 * @param tbook
	 */
	public Book(int id, String t, String aName, String aSurname, Range d, Type tbook)
	{
		this.id = id;
		this.title = t;
		this.autorName = aName;
		this.autorSurname = aSurname;
		this.date = d;
		
	}

}
