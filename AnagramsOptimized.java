package com.sushil.DSA;

public class AnagramsOptimized {

	public static void main(String[] args) {
		
		int[] str1Array = new int[256];
		//int[] str2Array = new int[256];
		
		String str1 = "@!%";
		String str2 = "!%@";
		boolean isAnagram= true;
		
		if(str1.length() != str2.length())
			System.out.println("Not Anagram");
		else 
		{
			
			for(char c : str1.toCharArray())
			{
				int index = (int) c;
				str1Array[index]++;	
			}
			
			for(char c : str2.toCharArray())
			{
				int index = (int) c;
				str1Array[index]--;
			}
			
			for(int i =0; i<str1.length(); i++)
			{
				if(str1Array[i] != 0)
				{
					isAnagram = false;
					break;
				}
			}			

		}
		
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
