package com.Inheritance;

public class Book {
	
	int book_id;
	String book_name, author_name;
	float price;
	
	public Book(int book_id, String book_name, String author_name, float price) {
		super();
		// TODO Auto-generated constructor stub
		this.book_id = 101;
		this.book_name = "Ramayan";
		this.author_name = "st.valmiki";
		this.price = 600;
	}
	public void display() 
	{
		System.out.println("Id:"+book_id+ "\nnName:"+book_name+ "\nauthor"+author_name+ "\nprice:"+price);
	}
	}

