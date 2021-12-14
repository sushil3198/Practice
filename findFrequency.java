package com.sushil.DSA;

public class findFrequency {

	static int frequencyOfaNumber(int[] arr, int x)
	{
		int count = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == x)
				count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		
		int arr[] = {10,20,1,3,1,30,45,67,1,5,3};
		int x = 1;
		System.out.println("Frenquency of X is: " + frequencyOfaNumber(arr, x));
	}
}
