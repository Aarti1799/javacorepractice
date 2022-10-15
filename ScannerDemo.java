//import java.util.*;
import java.util.Scanner;

class ScannerDemo
{
	public static void main(String args[])
	{
		//creating object and scanner class
		Scanner sc = new Scanner(System.in);
		
		//declaring an initializing local variabls
		System.out.println("Enter your name-");
		String name=sc.next();
		
		System.out.println("Enter your age-");
		int age=sc.nextInt();
		
		System.out.println("Enter your gender Female/Male-");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter your marks-");
		int marks=sc.nextInt();
		
		System.out.println("Enter your Pass/Fail-");
		boolean pass=sc.nextBoolean();
		
		//printing the valuse of all the variables
		System.out.print("----------------------------------");
		System.out.print("Name-"+ name);
		System.out.print("Age-"+age);
		System.out.print("Gender-"+gender);
		System.out.print("Marks-"+marks);
		System.out.print("pass-"+pass);
		
	}
	
}