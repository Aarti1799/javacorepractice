package com.calculator;

import java.util.Scanner;

public class Calculator1 {
	
	public static void main(String[] args) {
		
		Calculator ct = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		float num1, num2;
		int choice;
		
		System.out.println("Enter ywo numbers:");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. Division");
		
		
		System.out.println("Enter your choce:");
		choice = sc.nextInt();
		
	switch (choice) 
	  {
	case 1: ct.add(num1,num2);
	       break;
	case 2: ct.sub(num1,num2);
           break;
	case 3: ct.mul(num1,num2);
            break;
	case 4: ct.div(num1,num2);
            break;
     default: System.out.println("wrong input");
	
	
	  }
	}

}
