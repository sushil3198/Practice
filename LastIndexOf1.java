package com.sushil.DSA;
//Given a string S consisting only '0's and '1's,  find the last index of the '1' present in it.
public class LastIndexOf1 {

	public static void main(String[] args) {
		
		// int index = -1;
	        String s = "01";
	        for(int i = s.length()-1; i>=0; i--)
	        {
	            if(s.charAt(i) == '1') {
	                System.out.println(i);
	            break;
	            }
	        }
	        
	        //System.out.println(index);
	}
}
