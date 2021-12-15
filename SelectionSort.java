package com.sushil.DSA;

public class SelectionSort {

	static int[] sSort(int arr[])
	{
		int indexOfMin = 0;
		for(int i = 0; i<arr.length; i++) // loop for number of passes
		{
			indexOfMin = i;
			for(int j = i+1; j<arr.length; j++)  // loop for comparing each element in each pass
			{
				if(arr[j] < arr[indexOfMin])
					indexOfMin = j;
			}
			
			// swap the current minimu element with updated indexOfMin
			int temp = arr[i];
			arr[i] = arr[indexOfMin];
			arr[indexOfMin] = temp;
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {12,45,2,67,4,1};
		int[] a = sSort(arr);
		for(int i : a)
			System.out.print(i + " ");
	}
}
