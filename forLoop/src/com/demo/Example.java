/*
 * program: to display table
 * @author: Aarti
 * @Date: 28 oct oct
 */

//declaring package
package com.demo;

//declaring class
public class Example {
	
	//creating method
	static void printTable(int num) {
		//starting of for loop
		for(int i=1; i<=10;i++) {
			//print output
			System.out.println(num + "X" + i + " = " + (num*i));
			}
	}
	//main method
	public static void main(String[] args)
	{
		//call method
		printTable(7);
	}
}
