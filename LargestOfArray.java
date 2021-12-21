package com.sushil.DSA;

public class LargestOfArray {

	public static void main(String[] args) {
		int[] arr = {1,56,2,90,456};
		int max = arr[0];
		for(int i  = 0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println("Max Element is : " + max);
	}
}
