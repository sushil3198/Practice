package com.sushil.DSA;
/*Given an array arr of n elements which is first increasing and then may be decreasing, find the maximum element in the array.
Note: If the array is increasing then just print then last element will be the maximum value.

Example 1: arr[] = {1,15,25,45,42,21,17,12,11}

Output: 45
Explanation: Maximum element is 45.

*/
public class BitonicPoint {

	public static void main(String[] args) {
		int arr[] = {12,45,23,67,34,99,32,21,11,1};
		int n = arr.length;
		boolean flag = true;
		for(int i = 0; i<n-1; i++)
		{
			if(arr[i+1] > arr[i]) continue; // check if next element is greater than current or not
			else { System.out.println(arr[i]); flag = false; break; }
		}
		if(flag) System.out.println(arr[n-1]);
	}
}
