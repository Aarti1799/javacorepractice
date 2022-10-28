/*
 * program: to display pattern
 * @author: Aarti
 * @Date: 28 oct oct
 */

////declaring package
package com.Nestedfor;

//declaring class
public class NestedFor {
	//main method
	public static void main(String[] args){
	
		//start loop
	for(int i=1; i<=10; i++) {
		System.out.println();
		for(int j = 1; j<=i; j++) {
			if(i==j)
				break;
			System.out.print(j + " ");
		}
		//end of loop
	
	}
	}//end of main

}//end of class
