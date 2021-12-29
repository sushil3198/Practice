package com.sushil.DSA;
/*
 Given an array of N positive integers where all numbers occur even number of times except one number which 
 occurs odd number of times. Find the exceptional number.

Example 1:

Input: arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3
*/

public class ExceptionallyOdd {

	public static void main(String[] args) {
		int[]  arr = {1,2,3,2,3,1,1};
		int n = arr.length;
		int xorVar = 0;
        for(int i = 0; i<n; i++)
        {
            xorVar = xorVar ^ arr[i];
        }
        System.out.println(xorVar);
	}
}
