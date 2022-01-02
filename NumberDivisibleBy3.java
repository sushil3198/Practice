package com.sushil.DSA;
/*Given an array arr of integers of length N, the task is to find whether it’s possible to construct an integer 
  using all the digits of these numbers such that it would be divisible by 3. If it is possible then print “1” 
  and if not print “0”.

Example 1: arr = {40, 50, 90}
Output: 1
Explaination: One such number is 405900.*/
public class NumberDivisibleBy3 {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int n = arr.length;
		
		int sum = 0;
        for(int i = 0; i<n; i++)
        {
            sum += arr[i];
        }
        
        if(sum%3 == 0)
        {
            System.out.println(1);
        }
        else
        System.out.println(0);
	}
}
