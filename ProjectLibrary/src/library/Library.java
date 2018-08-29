package library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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
				+ "\n total number of borrow : " + sumTotal);

	}
	
	/**
	 * method search book by title 
	 */
	public void searchTitle()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter search title (minimum three letter) : ");
		String inTitle = in.next();
		
		boolean isFound = false;
		
		if(inTitle.length() >= 5)
		{
			for(Book b : books)
			{
				if( b.getTitle().toLowerCase().contains(inTitle.toLowerCase()) )
				{
					isFound = true;
					if ( isFound)
					{
						System.out.println(b.getTitle());
					}
					else
					{
						System.out.println("There isn't such title");
					}
				}
			} 
		}
		else
		{
			System.out.println("Entered too small amount letter!");
		}
		
	}
	
	/**
	 * method search book by autor surname 
	 */
	public void searchName()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter search autor surname (minimum three letter) : ");
		String inName = in.next();
		
		boolean isFound = false;
		for(Book b : books)
		{
		    if( b.getAutorSurname().toLowerCase().contains(inName.toLowerCase()) )
		    {
		        isFound = true;
		        if ( isFound)
		        {
			        System.out.print(b.getAutorSurname() + " : ");
			        System.out.println(b.getTitle());
				}
				else
				{
				    System.out.println("There isn't such author");
				}
		    }
		}
	}
	
	
}
