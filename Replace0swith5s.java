package com.sushil.DSA;
//You are given an integer N. You need to convert all zeroes of N to 5.
//Input: 1004
//Output: 1554
public class Replace0swith5s {

	public static void main(String[] args) {
		int place=1;
	    int sum=0;
	    int num = 1004;
	    while(num>0){
	       int rem=num%10;
	       if(rem==0){
	           sum=sum+place*5;
	       }
	       else{
	           sum=sum+place*rem;
	       }
	       place=place*10;
	       num=num/10;
	   }
	    
	    System.out.println(sum);
	}
}
