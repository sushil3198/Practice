package com.sushil.DSA;

import java.util.Arrays;

public class PermutationsInArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		int  b[] = {7,8,9};
		int k = 10;
		int n = a.length;
		Arrays.sort(a);
        Arrays.sort(b);
       
       for(int i=0;i<n;i++)
       {
           if(a[i]+b[n-1-i] < k)
               System.out.println(false);
       }
       System.out.println(true);
	}
}
