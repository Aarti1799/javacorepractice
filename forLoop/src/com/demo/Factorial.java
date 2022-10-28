/*
 * program: to print factorial of any number
 * @Auother: aarti
 * @Date: 28 oct
 * */

//declaring package
package com.demo;

//import Scanner
import java.util.Scanner;

//declaring class
public class Factorial {
	//taking method
	static void  printFactorial(int num) {
		
		//declaring variables
		long fact = 1;
		//start of for loop
		for(int i = 1; i>1; i++) {
			fact = fact*i;//calculation
			System.out.println(fact + " ");

		}
		//printing output
			
			System.out.println(" the factorial is:" +fact);
		
	}
	//starting of main method
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);//object of scanner 
		 System.out.println("Enter any number");//taking of user input
		 int num = sc.nextInt();
		 printFactorial(num);//call method
		 sc.close();
		
	}//end of main

}//end of class
