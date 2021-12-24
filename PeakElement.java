package com.sushil.DSA;

public class PeakElement {
// Peak Element is same as fnding Max element of an Array.
	static int findPeakElement(int arr[])
	{
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {1,54,67,34,390};
		System.out.println("Peak Element: " + findPeakElement(arr));
	}
}
