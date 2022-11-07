package com.constructorOverloading;

public class Constructor {
	
	 public Constructor() 
	{
		System.out.println("default constructor");
	}
	
	
	public Constructor(int a, int b) {
		System.out.println("constructor of 2 paramiter of int datatype");
		System.out.print(a+ " ");
		System.out.println(b);
	}
	
	 public Constructor(float a, float b) 
	{
		 System.out.println("constructor of 2 paramiters of float datatype");
		System.out.println(a);
		System.out.println(b);

	}

}
