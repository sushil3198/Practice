package com.sushil.DSA;
// Sort an Array of 0s 1s and 2s.
public class ArraysOf0s1s2s {

	public static void main(String[] args) {
		int arr[] = {0, 2, 1, 2, 0};
		int n = arr.length;
		 int n0 = 0;
         int n1 = 0;
         int n2 = 0;
	        
	        for(int i = 0; i<n; i++)
	        {
	            if(arr[i] == 0) n0++;
	            else if(arr[i] == 1) n1++;
	            else if(arr[i] == 2) n2++;
	        }
	        
	        
	        for(int i = 0; i<n0; i++)
	        {
	            arr[i] = 0;
	        }
	        
	        for(int i = n0; i<n1 + n0; i++)
	        {
	            arr[i] = 1;
	        }
	        
	        for( int i = n1 + n0; i <n0 + n1 + n2; i++)
	        {
	            arr[i] = 2;
	        }
	        
	        for(int i : arr)
	        {
	        	System.out.print(i + " ");
	        }
	}
}
