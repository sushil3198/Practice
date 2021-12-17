package com.sushil.DSA;

import java.util.Scanner;

public class PatternProblemsSimple {

	public static void main(String[] args) {
		
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 

		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
				System.out.print("*" + " ");
			System.out.println();
		}
		
		System.out.println();
	
		
		
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 

		for(int i = 1; i<=5; i++)
		{
			for(int j = 5; j>=i; j--)
				System.out.print("*" + " ");
			System.out.println();
		}
	
		
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
	
		for(int i = 5; i>=1; i--)
		{
			for(int j = 5; j>=1; j--)
			{
				if(i<j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

//		 	 * 
//		    * * 
//		   * * * 
//		  * * * * 
//		 * * * * * 
		
		
		for(int i=1;i<=5;i++) {
		   for(int j=5;j>=i;j--) {
		    System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++) {
		    System.out.print("* ");
		   }
		   
		   System.out.println();
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some input number: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=n-i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
