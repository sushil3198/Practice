package com.sushil.DSA;
/*
	Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
	In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

	Input: arr[] = {2,4,7,8,9,10}
	Output: 4 2 8 7 10 9


*/
public class WaveArray {

	public static void main(String[] args) {
		int arr[] = {2,4,7,8,9,10};
		for(int i = 0; i<arr.length-1; i+=2)
        {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            
        }
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
        
	}
}
