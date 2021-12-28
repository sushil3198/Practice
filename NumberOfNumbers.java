package com.sushil.DSA;
/*
 Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting 
 the total number of times digit k appears in the whole array.

For Example:

Input: arr[]={11,12,13,14,15}, k=1
Output:6

*/
public class NumberOfNumbers {

	public static void main(String[] args) {
		int arr[] = {11,12,13,14,15};
		int k = 1;
		int counter = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int remainder = 0;
            while(arr[i] > 0)
            {
                remainder = arr[i]%10;
                if(remainder == k)
                   counter++;
               arr[i] = arr[i]/10;    
            }
        }
        
        System.out.println(counter);
        
	}
}
