package com.sushil.DSA;

public class LinearSearch {

	static int doLinearSearch(int arr[],int x)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == x)
				return i;
		}
		return 0;
	}
	public static void main(String[] args) {
		// for Linear Search, array can be either sorted or unsorted.
		int[] arr = {1,45,2,76,5,3,67,334,687,89};
		int x = 67;
		int op = doLinearSearch(arr, x);
		if(op == 0)
		System.out.println("Element is not found");
		else
			System.out.println("Element found at index: " + op);
	}
}
