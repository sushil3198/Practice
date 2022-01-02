package com.sushil.DSA;
/*Given a sorted array containing only 0s and 1s, find the transition point. 


Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.
*/
public class TransitionPoint {

	public static void main(String[] args) {
		int arr[] = {0,0,0,1,1};
		int n = arr.length;
		int index = -1;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == 1){ index = i; break; }
        }
        System.out.println(index);
	}
}
