package com.sushil.DSA;

//Given an array arr[] of size N, the task is to add the minimum number(should be greater than 0) to the array so
//that the sum of the array becomes even


public class MinimumNumbertoEvenSum {

	public static void main(String[] args) {
		
		long sum = 0;
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i = 0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        
        if(sum%2 == 0)
        System.out.println(2);
        else
        System.out.println(sum%2);
	}
}
