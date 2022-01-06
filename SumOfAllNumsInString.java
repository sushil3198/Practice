package com.sushil.DSA;
//
public class SumOfAllNumsInString {

	public static void main(String[] args) {
		
		String abc = "1abc23xyz334";
		String temp = "0";
		int sum = 0;
		for(int i = 0; i<abc.length(); i++)
		{
			char ch = abc.charAt(i);
			
			if(Character.isDigit(ch)) temp += ch;
			
			else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
			
		}
		
		// here Integer.parseInt(temp) takes care of trailing number meaning the numbers at the end of string will be added to final sum
		System.out.println(sum + Integer.parseInt(temp));
	}
}
