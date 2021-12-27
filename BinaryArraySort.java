package com.sushil.DSA;
// Sort a binary Array
// Binary Array has only 1s and 0s.
public class BinaryArraySort {

	public static void main(String[] args) {
		
		int arr[] = {1,0,0,1,1,1,0,1,0,1,1,0};
		int c = 0;
	    for(int i = 0; i<arr.length; i++)
	    {
	        if(arr[i] != 1)
	        {
	            int temp = arr[i];
	            arr[i] = arr[c];
	            arr[c] = temp;
	            c++;
	        }
	    }
	    for(int i : arr)
	    {
	    	System.out.print(i + " ");
	    }
	}
}
