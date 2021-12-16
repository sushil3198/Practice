package com.sushil.DSA;

public class Sorting0sAnd1s {

	static int[] sortArray(int[] a)
	{
		int indexOfMin = 0;
		for(int i = 0; i<a.length; i++) // loop for number of passes
		{
			indexOfMin = i;
			for(int j = i+1; j<a.length; j++)  // loop for comparing each element in each pass
			{
				if(a[j] < a[indexOfMin])
					indexOfMin = j;
			}
			
			// swap the current minimu element with updated indexOfMin
			int temp = a[i];
			a[i] = a[indexOfMin];
			a[indexOfMin] = temp;
		}
		
		return a;
	}
	public static void main(String[] args) {
		
		int arr[] = {0,1,0,1,1,0,2,2,2};
		int[] op = sortArray(arr);
		for(int i : op)
			System.out.print(i + " ");
	}
}
