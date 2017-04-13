/*

Create a class called Book to represent a book. A Book should include four pieces of information as instance
variables‐a book name, an ISBN number, an author name and a publisher. Your class should have a constructor
that initializes the four instance variables. Provide a mutator method and accessor method (query method) for
each instance variable. Inaddition, provide a method named getBookInfo that returns the description of the
book as a String (the description should include all the information about the book). You should use this keyword
in member methods and constructor. Write a test application named BookTest to create an array of object for 30
elements for class Book to demonstrate the class Book's capabilities.

*/

/*Powered by Vlad Hrytsuk, vlad-aizen@yandex.by*/

package Topic4_Array;

import java.util.Scanner;

public class BookTest {
	private String book;
	private String author;
    private String publisher;
	private int ISBN_number;
	
	public BookTest (){
	}
	
	public void setBook(String book){
		this.book = book;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public void setISBN_number(int ISBN_number){
		this.ISBN_number = ISBN_number;
	}

	public String getBook(){
		return book;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public int getISBN_number(){
		return ISBN_number;
	}
	
	public void getBookInfo(){
		System.out.println("Book name: " + getBook() + "| ISBN_number: " + getISBN_number() + "| Author: " + getAuthor() + "| Publisher: " + getPublisher());
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in2 = new Scanner (System.in);
		System.out.print("Введите кол-во записей: ");
		int n = in2.nextInt();
		BookTest[]ob = new BookTest[n];
		
		for (int i = 0; i < ob.length; i++) {
			String []book = new String [256];
			String []Author = new String [256];
			String []Publisher = new String [256];
			int []ISBN_number = new int [256];
			Scanner in = new Scanner (System.in);
			ob[i] = new BookTest();
			System.out.print("Введите book: ");
			book[i] = in.nextLine();
			System.out.print("Введите Author: ");
			Author[i] = in.nextLine();
			System.out.print("Введите Publisher: ");
			Publisher[i] = in.nextLine();
			System.out.print("Введите ISBN_number: ");
			ISBN_number[i] = in.nextInt();
			
			ob[i].setBook(book[i]);
			ob[i].setAuthor(Author[i]);
			ob[i].setPublisher(Publisher[i]);
			ob[i].setISBN_number(ISBN_number[i]);
			System.out.println();

		}
		System.out.println();
		System.out.println("Список: ");
		for (int i = 0; i < ob.length; i++) {
			ob[i].getBookInfo();
		}
		
	
		in2.close();
	}
}
