package com.sushil.DSA;

import java.util.Arrays;

public class MaxProductOf2Nums {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		Arrays.sort(arr);
        int product;
        product = arr[n-1]*arr[n-2];
        System.out.println(product);
	}
}
