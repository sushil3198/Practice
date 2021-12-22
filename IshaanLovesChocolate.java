package com.sushil.DSA;
/*

As we know, Ishaan has a love for chocolates. He has bought a huge chocolate bar that contains N chocolate squares. Each of the squares has a tastiness level which is denoted by an array A[].
Ishaan can eat the first or the last square of the chocolate at once. Ishaan has a sister who loves chocolates too and she demands the last chocolate square. Now, Ishaan being greedy eats the more tasty square first. 
Determine the tastiness level of the square which his sister gets.

Input : arr[ ] = {5, 3, 1, 6, 9}
Output : 1

*/
public class IshaanLovesChocolate {

	public static void main(String[] args) {
		int[] arr = {5,4,7,4,1,5,8,3};
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("Sister will get: " + min);
	}
}
