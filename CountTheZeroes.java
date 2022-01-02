package com.sushil.DSA;
/*Given an array of size N consisting of only 0's and 1's. The array is sorted in such a manner that all the 1's are placed 
 first and then they are followed by all the 0's. Find the count of all the 0's.

Example 1:
Input: Arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
Output: 3
Explanation: There are 3 0's in the given array.*/
public class CountTheZeroes {

	public static void main(String[] args) {
		int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};
		int n = arr.length;
		
		int counter = 0;
        for(int i = n-1; i>=0; i--)
        {
            if(arr[i] == 1) break;
            else counter++;
        }
        System.out.println(counter);
	}
}
