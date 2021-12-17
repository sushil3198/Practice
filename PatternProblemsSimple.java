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
		
		
//		for n = 5
		
		//        *  
		//      *  *  
		//    *  *  *  
		//  *  *  *  *  
		//*  *  *  *  *  

		
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
		
		
		
		//        1  
		//      2  3  
		//    4  5  6  
		//  7  8  9  10  
		//11  12  13  14  15  

		
		
		Scanner sc1 = new Scanner(System.in);
		int n1 = sc.nextInt();
		int number = 1;
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<= n-i; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<= i ; j++)
			{
				System.out.print(number++ + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
		//		* 
		//		* * 
		//		* * * 
		//		* * * * 
		//		* * * 
		//		* * 
		//		* 

		
		Scanner sc2 = new Scanner(System.in);

		
		int n3 = sc.nextInt();
		
		
		int rows = 2*n3-1;
		
		for(int i = 1; i<=rows; i++)
		{
			if(i<=n3)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}	
			}
			else {
				for(int j = 1; j <= rows-i+1; j++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
