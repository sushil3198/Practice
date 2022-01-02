package com.sushil.DSA;
/*Working with 2D arrays is quite important. Here we will do swapping of column in a 2D array. 
 You are given a matrix M or r rows and c columns. You need to swap the first column with the last column.

Example:

Input:
3 4
1 2 3 4
4 3 2 1
6 7 8 9

Output:
4 2 3 1
1 3 2 4
9 7 8 6
*/
public class MatrixInterchange {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int r = 3;
		int c = 3;
		for(int i = 0; i<r; i++)
        {
            int temp = arr[i][0];
            arr[i][0] = arr[i][c-1];
            arr[i][c-1] = temp;
        }
        
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        } 
	}
}
