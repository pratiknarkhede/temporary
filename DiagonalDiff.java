package com.practise;

import java.util.Arrays;
import java.util.Random;

public class DiagonalDiff {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = new Random().nextInt(10);
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		int absoluteDiff = calAbsoluteDiff(matrix, n);
		System.out.println();
		System.out.println(absoluteDiff);
	}

	private static int calAbsoluteDiff(int[][] matrix, int n) {
		int diagonalSum1 = 0, diagonalSum2 = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(matrix[i][i]+" ");
			diagonalSum1 += matrix[i][i];
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			
			System.out.print(matrix[i][n-1-i]+ " ");
			diagonalSum2 += matrix[i][n-1-i];
			
		}

		return diagonalSum1 - diagonalSum2;
	}

}
