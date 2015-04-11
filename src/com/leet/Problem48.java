package com.leet;

public class Problem48 {
public static void rotate(int[][] matrix) {
	
	    
        int [][] arr= new int[matrix.length][matrix.length];
        for (int j = 0; j < matrix.length; j++)  {//col
        	for (int i = matrix.length-1; i >=0; i--) {//row
				
				arr[j][matrix.length-i-1]= matrix[i][j];
				
			}

		}
    	for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr.length; k++) {
				matrix[i][k]=arr[i][k];
			}
		}
        
        
    }
public static void main(String[] args) {
	int a[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
	rotate(a);
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[i][j]);
		}
	}
}

}
