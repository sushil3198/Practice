package com.sushil.DSA;

import java.util.ArrayList;

/*
 
	Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array. Task is to find the sum of the 
	left diagonal values of the 2-d array and the max element of the 1-d array and print them with space in between. 
 
 Input : a[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} 
         and N = 3
		 b[] = {3, 6, 9}		 
 Output : 15 9
 
 
 */
public class OneDandTwoDArray {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3}, {4,5,6}, {7, 8,9}};
		int b[] = {3, 6, 9};
		int sum = 0;
        int max = b[0];
        for(int i  = 0; i<b.length; i++)
        {
            if(b[i] > max)
                max = b[i];
        }
        
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a.length; j++)
            {
                if(i == j)
                {
                    sum += a[i][j];
                }
            }
        }
        
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(sum);
        aList.add(max);
        
        for(int c : aList)
        {
        	System.out.print(c + " ");
        }
	}
}
