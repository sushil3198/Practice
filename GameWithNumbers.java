package com.sushil.DSA;

/*
	You are given an array arr[], you have to re-construct an array arr[].
 	The values in arr[] are obtained by doing Xor of consecutive elements in the array.
	
	Input : arr[ ] = {10, 11, 1, 2, 3}
	Output : 1 10 3 1 3	 
 
 */

public class GameWithNumbers {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 11, 1, 2, 3};
		
		for(int i = 0; i<arr.length; i++)
        {
            if(i!=arr.length-1)
            {
                arr[i] = arr[i]^arr[i+1];
            }
        }
		System.out.print("Output: ");
		for(int n : arr)
		{
			System.out.print(n + " ");
		}
}
}
