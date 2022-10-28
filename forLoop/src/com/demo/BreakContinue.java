/*
 * program:  ... using break and continue 
 * */
//declaring package
package com.demo;

//declaring class
public class BreakContinue {
	//main method
	public static void main(String[] args) {
		System.out.println(".........................................");

		for( int i=1; i<=10; i++)
		{
			if(i==8)
				break;// to come out of the loop
			
			System.out.println(i);
				
		}
		System.out.println(".........................................");
		
		for( int i=1; i<=10; i++)
		{
			if(i==8)
			continue;   //skips the iteration for that particular value
			System.out.println(i);
		}

		
	}

}
