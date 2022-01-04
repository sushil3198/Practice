package com.sushil.DSA;

import java.util.ArrayList;
import java.util.Collections;

/*Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader 
  if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

Example 1:

Input: A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
*/

public class LeadersInArray {
public static void main(String[] args) {
	
	int arr[] = {16,17,4,3,5,2};
	int n = arr.length;
	ArrayList<Integer> tempList = new ArrayList<Integer>();
	int max = arr[n-1];
	for(int i =  n-1; i>=0; i--)
	{
		if(arr[i] >= max)
		{
			max = arr[i];
			tempList.add(max);
		}
	}
	Collections.reverse(tempList);
	for(int i : tempList)
	{
		System.out.print(i + " ");
	}
	
}
}
