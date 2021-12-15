package com.infy.demo;

public class BubbleSortArray {

	static int[] bSort(int arr[])
	{
		boolean isSorted = false;
		for(int i = 0; i< arr.length; i++)
		{
			isSorted = true;
			int temp = 0;
			for(int j = 0; j<arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}
			}
			if(isSorted == true)
				break;
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int[] arr = {45,23,6,1,8,2};
		int[] a = bSort(arr);
		for(int i : a)
			System.out.print(i + " ");
	}
}
