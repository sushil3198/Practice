package com.sushil.DSA;

/*
	Given an unsorted array arr of size N, rearrange the elements of array such that number at the odd index 
	is greater than the number at the previous even index. The task is to complete the function formatArray() 
	which will return formatted array.

	Input: arr[] = {5, 4, 3, 2, 1}
	Output: 4 5 2 3 1

*/

public class PlayWithArray {

	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		for(int i = 0; i<arr.length; i++)
        {
            if(i%2 != 0)
            {
                if(arr[i] < arr[i-1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
        }
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
        
	}
}
