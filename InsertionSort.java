package com.sushil.DSA;

public class InsertionSort {

	static int[] insSort(int arr[])
	{
		for(int i = 1; i<arr.length; i++)
		{
			// 12,54,65 | 7,45,23,8
			int key,j;
			key = arr[i];
			j = i-1;
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
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
