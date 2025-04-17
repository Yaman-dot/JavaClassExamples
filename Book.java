package week9;

public class Book 
{
	String title;
	String author;
	boolean available;
	
	public Book(String title, String author, boolean available) {
		super();
		this.title = title;
		this.author = author;
		this.available = available;
	}
	
	public boolean borrowBook()
	{
		return available = false;
	}
	public boolean returnBook()
	{
		return available = true;
	} 
	
	public void DisplayInfo()
	{
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("is Available: " + available);
	}
	
}
