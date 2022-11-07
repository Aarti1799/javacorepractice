package com.Inheritance;

import com.Inheritance.Book;

public class Paperbook extends Book {
	public Paperbook(int book_id, String book_name, String author_name, float price) {
		super(book_id, book_name, author_name, price);
		// TODO Auto-generated constructor stub
	}
	int shipping_charges=10;
	void print()
	{
		display();
		System.out.println("shipping charges:"+shipping_charges);
	}
	public static void main(String[] args) 
	{
		Paperbook ob = new Paperbook(0, null, null, 0);
		
		ob.print();
	}
	

}
