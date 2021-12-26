package com.sushil.DSA;


/*
 * Given an array arr[] return true if the sum of three consecutive elements is 0 else return false.
 * */
public class TripletsSumZero {

	public static void main(String[] args) {
		int[] arr = {97, -27, 2, -34, 61, -39};
		int j = 0;
        int k = 2;
        //int sum = 0;
        boolean flag = false;
        
        if(arr.length < 3)
        	System.out.println(flag);
        
        else {
	        for(int a = 0; a<arr.length; a++)
	        {
	             int sum = 0;
	            for(int i = j; i<=k; i++)
	            {
	            	System.out.println(j + " " + k + " ");
	                sum += arr[i];    
	            }   
	            if(sum == 0){
	                flag = true;
	                 break;   
	            }
	            if(k<arr.length-1 && j < arr.length){
	                j++;
	                k++;
	            }
	            
	        }
	        System.out.println(flag);
        }
        
	}
}
