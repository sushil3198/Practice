package com.sushil.DSA;
// brute force optimised
public class Anagrams {

	public static void main(String[] args) {
		
		String str1 = "aab";
		String str2 = "abc";
		boolean[] visited = new boolean[str2.length()];
		
		boolean isAnagram = false;
		if(str1.length() == str2.length())
		{
			for(int i = 0; i<str1.length(); i++)
			{
				isAnagram= false;
				for(int j = 0; j < str2.length(); j++)
				{
					if(str2.charAt(j) == str1.charAt(i) && !visited[j])
					{
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram)
					break;
			}
			
			if(isAnagram)
				System.out.println("Strings are Anagram");
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("Not an Anagram");
		
		
	}
}
