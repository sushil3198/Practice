package com.sushil.DSA;

//Given a sorted array consisting 0’s and 1’s. The task is to find the index of first ‘1’ in the given array.

public class FirstIndexOf1 {

	public static void main(String[] args) {
		int arr[] = {0,0,0,0,0,1,1,1,1};
		int n = arr.length;
		long index = 0;
        if(arr[0] == 1)
        System.out.println(0);
        
        for(int i = 0; i< n; i++)
        {
            if(arr[i] == 1)
            {
                index = i;
                break;
            }
        }
        
        if(index > 0)
        System.out.println(index);
        else
        System.out.println(-1);;
	}
}
