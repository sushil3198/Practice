package com.sushil.DSA;
//	Given an array, rotate the array by one position in clock-wise direction.
// Input :  {1,2,3,4,5}
// Output : {5,1,2,3,4}
public class CyclicallyRotationOfArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		// 1,2,3,5,4 i = 4
		// 1,2,5,3,4 i = 3
		// 1,5,2,3,4 i = 2
		// 5,1,2,3,4 i = 1
		int first = arr[arr.length -1];
		
		for(int i = arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = first;
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(4/2);
	}
}
