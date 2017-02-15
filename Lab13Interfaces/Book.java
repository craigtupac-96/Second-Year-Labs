/*
 * Author: Craig Lawlor
 * C00184465
 */
package Lab13Interfaces;

public class Book extends LibraryItem {
	private String author;
	private String title;
	private int numPages;
	
	public Book(String type, String id, String writer, String name, int num){
		super(type, id);
		setAuthor(writer);
		setTitle(name);
		setNumberPages(num);
	}
		
	public void setAuthor(String writer){
		author = writer;
	}
	
	public void setTitle(String name){
		title = name;
	}
	
	public void setNumberPages(int num){
		numPages = num;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public int numberPages(){
		return numPages;
	}
	
	public void calculatePrice(){
		System.out.println("Price: " + numPages / 20);
	}
	
	public String toString(){
		return ("\nAuthor: " + author + "\nTitle: " + title + super.toString() +"\nNumber of Pages: " + numPages);
	}
}
