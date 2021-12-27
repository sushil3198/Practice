package com.sushil.DSA;
/*
 Given an array Arr of N positive integers and a number K where K is used as a threshold value to divide 
 each element of the array into sum of different numbers. Find the sum of count of the numbers in which array 
 elements are divided.
 
Input: K = 4
		Arr[] = {10, 2, 3, 4, 7}

Output: 8

Explanation: Each number can be expressed as sum of
different numbers less than or equal to K as
10 (4 + 4 + 2), 2 (2), 3 (3), 4 (4) and 7 (4 + 3).
So, the sum of count of each element is 
(3 + 1 + 1 + 1 + 2) = 8.

 
 */
public class TotalCount {

	public static void main(String[] args) {
		int arr[] = {10, 2, 3, 4, 7};
		int k = 4;
		int sum = 0;
        int quotient = 0;
        int remainder = 0;
        for(int i = 0; i<arr.length; i++)
        {
            quotient = arr[i]/k;
            remainder = arr[i]%k;
            if(remainder != 0)
                remainder = 1;
            sum += quotient + remainder;
        }
        
        System.out.println(sum);
	}
}
