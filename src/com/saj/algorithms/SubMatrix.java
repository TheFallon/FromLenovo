package com.saj.algorithms;

import java.util.Arrays;

/**
matrix = {{1, 8, 6, 2}, 
          {4, 5, 3, 9}, 
          {2, 7, 1, 6}}
rowsToDelete = {1} and columnsToDelete = {0, 2}, the output should be

constructSubmatrix(matrix, rowsToDelete, columnsToDelete) = [8,2],
                                                            [7,6]
*/
public class SubMatrix {
	public static void main(String[] args) {
		// Arrays needed to call and construct the desired sub-matrix.
		int[][] matrix = {{1,8,6,2,4,0},{4,5,3,9,7,4},{2,7,1,6,2,5},{2,5,9,0,5,8},{6,8,1,9,4,6},{0,3,7,4,2,7}};
		int[] rowsToDelete = {0,1,3,5};
		int[] columnsToDelete = {0,2,4,5};
		
		// Create an array to hold the sub-matrix, initialize it with a call
		// to the constructSubMatrix method. Pass matrix[][], rowsToDelete[], 
		// and columnsToDelete[].
		int[][] subMatrix = constructSubMatrix(matrix, rowsToDelete, columnsToDelete);
		
		// Print the matrix.
		System.out.println("Original matrix:");
		for(int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				if(j+1 < (matrix.length)) {
					System.out.print(", ");
				}
				else {
					System.out.print("],");
				}
			}
			System.out.println();
			System.out.println();
		}		
		System.out.println();
		System.out.println();
		
		// Print the sub-matrix.
		System.out.println("Sub-matrix:");
		for(int i = 0; i < subMatrix.length; i++) {
			System.out.print("[");
			for(int j = 0; j < subMatrix[i].length; j++) {
				System.out.print(subMatrix[i][j]);
				if(j+1 < (subMatrix.length)) {
					System.out.print(", ");
				}
				else {
					System.out.print("],");
				}
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public static int[][] constructSubMatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete){
		int[][] subMatrix = new int[matrix.length - rowsToDelete.length][matrix[0].length - columnsToDelete.length];
		
		for(int k = 0, i = 0; i < matrix.length; i++) {
			if(Arrays.binarySearch(rowsToDelete, i) >= 0)
				continue;
			for(int l = 0, j = 0; j < matrix[i].length;j++) {
				if(Arrays.binarySearch(columnsToDelete, j) >= 0) {
					continue;
				}
				subMatrix[k][l] = matrix[i][j];
				l++;		
			}
			k++;
		}	
		return subMatrix;
	}
}
