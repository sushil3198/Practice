package com.sushil.DSA;
// Given a list of names, display the longest name.

//names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" }
//Output: GeeksforGeeks

public class LongestOfString {

	public static void main(String[] args) {
		String[] names = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
		String longest = "";
		
		for(int i = 0; i<names.length; i++)
		{
			if(names[i].length() > longest.length())
			{
				longest = names[i];
			}
		}
		
		System.out.println("Output: " + longest);
		
	}
}
