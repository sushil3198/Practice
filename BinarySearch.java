package com.sushil.DSA;

//Array must be sorted for Binary Search

public class BinarySearch {

	static int doBinarySearch(int arr[], int x)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = (low + high)/2;
			
			if(arr[mid] < x)
				low = mid+1;
			else if(arr[mid] > x)
				high = mid-1;
			else
				return mid;
		}
		
		return 0;
	}
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
		int x = 8;
		int op = doBinarySearch(arr, x);
		
		if(op > 0)
			System.out.println(doBinarySearch(arr, x));
		else
			System.out.println("Element Not found");
	}
}
