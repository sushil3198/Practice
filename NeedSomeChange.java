package com.sushil.DSA;
/*Given an array arr of n positive integers. The task is to swap every ith element of the array with (i+2)th element.

Note: When passing array to function, we basically pass the reference to the array. More details here. We'll learn more about pointers and references in upcoming module.

Example:

Input:
n = 5
arr[] = 1 2 3 4 5
Output:
3 4 5 2 1
Explanation:
Swapping 1 and 3, makes the array 3 2 1 4 5.
Now, swapping 2 and 4, makes the array 
3 4 1 2 5. Again,swapping 1 and 5, makes the 
array 3 4 5 2 1.

*/
public class NeedSomeChange {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		for(int i = 0; i<n-2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
		
		for(int i : arr)
		{
			System.out.print(i + " ");
		}
	}
}
