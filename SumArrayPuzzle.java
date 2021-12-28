package com.sushil.DSA;
/*
 Given an array A of size N, construct a Sum Array S(of same size) such that S is equal to the sum of all the 
 elements of A except A[i]. Your task is to complete the function SumArray(A, N) which accepts the array A and N(size of array).
 
Input: 3 6 4 8 9
Output: 27 24 26 22 21

Explanation: For the sum array S, at i=0 we
have 6+4+8+9. At i=1, 3+4+8+9. At i=2, we 
have 3+6+8+9. At i=3, we have 3+6+4+9. At
i = 4, we have 3+6+4+8. So S is 27 24 26 22 21.

*/
public class SumArrayPuzzle {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int[] sumArray = new int[arr.length];
	    for(int i = 0; i<n; i++)
	    {
	        int sum = 0;
	        for(int j = 0; j<n; j++)
	        {
	            if(i != j)
	            sum += arr[j];
	        }
	        sumArray[i] = sum;
	    }
	    
	    for(int i : sumArray)
	    {
	        System.out.print(i + " ");
	    }
	}
}
