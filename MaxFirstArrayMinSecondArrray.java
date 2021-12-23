package com.sushil.DSA;
/*
 	Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate the product 
 	of the maximum element of the first array and minimum element of the second array.
 	
 	Input : A[] = {5, 7, 9, 3, 6, 2}, 
        	B[] = {1, 2, 6, -1, 0, 9}
	Output : -9
 	
 	*/
public class MaxFirstArrayMinSecondArrray {

	public static void main(String[] args) {
		int[] arr = {5, 7, 9, 3, 6, 2};
		int brr[] = {1, 2, 6, -1, 0, 9};
		long max = arr[0];
        long min = brr[0];
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        
        for(int i = 0; i<brr.length; i++){
            if(brr[i] < min)
            {
                min = brr[i];
            }
        }
        
        System.out.println(max*min);
	}
}
