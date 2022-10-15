 /*program:Addition Demo using Scanner
 Date: 14 oct 2022
 */
import java.util.Scanner;
class AdditionDemo
{
	//main method
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//declaring and initializing local variables
		System.out.println("Enter first no.-");
		int number1=sc.nextInt();
		  
		System.out.println("Enter second no.-");
        int number2=sc.nextInt();
        
		System.out.println("Enter thierd no.-");
        int number3=sc.nextInt();
		
		int sum=number1+number2+number3;  //Adding those three numbers
		System.out.println("the sum is:"+sum);//printing the sum of three numbers

	}//end of main
}//end of class