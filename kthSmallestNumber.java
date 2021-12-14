package com.sushil.DSA;

import java.util.PriorityQueue;

public class kthSmallestNumber {

	static int smallestNumber(int[] arr, int k)
	{
		int n = arr.length;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0; i<n; i++)
		{
			pq.add(arr[i]);	
		}
		
		while(k-1>0)
		{
			pq.poll();
			k--;
		}
		
		return pq.poll();
	}
	public static void main(String[] args) {
		int[] arr = {5,10,1,45,2,7,41};
		int k = 3;
		System.out.println(smallestNumber(arr, k));
	}
}
