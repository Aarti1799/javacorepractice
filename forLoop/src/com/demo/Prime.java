/*
 * program: to check number is prime or not
 * @date: 28 oct
 * */
//declaring package
package com.demo;

import java.util.Scanner;

//declaring class
public class Prime {
	//method
	static void checkPrime(int num) {
		boolean flag = true;
		if(num == 0 || num == 1) {
			
			System.out.println(num+ "is a prime number");
		}
		else
		{
			for(int i= 2; i<=num/2;i++)
		{
			System.out.println(num+ "is not a prime number");
           flag=true;
           break;
		}
		}
	
	if(flag=false) {
		
		System.out.println(num +  "is a prime number");
		}
	}
	
//main method
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number:");
	int number = sc.nextInt();
	
	//call method
	checkPrime(number);
}//end of main
}//end of class
