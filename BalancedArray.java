package com.sushil.DSA;

/*
 Given an array of even size N, task is to find minimum value that can be added to an element so that array 
 become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.
 	Input: arr[] = {1, 5, 3, 2}
	Output: 1
  
 */
public class BalancedArray {

	public static void main(String[] args) {
		int arr[] = {1, 5, 3, 2};
		long sum1 = 0;
        long sum2 = 0;
        int mid = arr.length/2;
        
        for(int i = 0; i<mid; i++)
        {
            sum1 += arr[i];
        }
        
        
        for(int i = mid; i<arr.length; i++)
        {
            sum2 += arr[i];
        }
        
        if(sum1 > sum2)
            System.out.println(sum1-sum2);
        else
            System.out.println(sum2-sum1);
	}
}
