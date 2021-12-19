package com.sushil.DSA;
// Complexity O(n^2)
public class InsertionSort {

	static int[] insSort(int arr[])
	{
		for(int i = 1; i<arr.length; i++)// Loop for passes
		{
			// 12,54,65 | 7,45,23,8
			int key,j;
			key = arr[i];
			j = i-1;
			while(j >= 0 && arr[j] > key) // Loop for computations in each pass
			{
				arr[j+1] = arr[j];  // comparing the adjacent elements and swapping if while loop condition = true
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {12,54,65,7,45,23,8};
		
		int[] a = insSort(arr);
		for(int i : a)
			System.out.print(i + " ");
	}
}
