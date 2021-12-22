package com.sushil.DSA;
/* Pitsy needs help in the given task by her teacher. The task is to divide a array into two sub array (left and right) 
   containing n/2 elements each and do the sum of the subarrays and then multiply both the subarrays.
   
	Input : arr[ ] = {1, 2, 3, 4}
	Output : 21
   */
public class SubArraySumAndProduct {

	public static void main(String[] args) {
		int arr[ ] = {1, 2, 3, 4};
		int mid = arr.length/2;
        int sum1 = 0;
        int sum2 = 0;
        //int multipy = 1;
        //int result = 0;
        
        for(int i = 0; i<mid; i++)
        {
            sum1 += arr[i];
        }
        
        for(int i = mid; i<arr.length; i++)
        {
            sum2 += arr[i];
        }
        
        System.out.println(sum1*sum2); 
	}
}
