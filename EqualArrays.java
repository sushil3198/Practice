package com.sushil.DSA;

import java.util.Arrays;

//Check if two arrays are equal or not
public class EqualArrays {

	public static void main(String[] args) {

		int A[] = {1,2,5,4,0};
		int B[] = {2,4,5,0,1};
		Arrays.sort(A);
	    Arrays.sort(B);
	      
	    boolean flag = true;    
	    for(int i = 0; i<A.length; i++)
        {
            if(A[i] != B[i])
            {
                flag  = false;
                break;
            }
        }
	    System.out.println(flag);
	}
}
