package com.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem54 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		int rows = matrix.length;
		if (rows == 0)
			return result;
		int cols = matrix[0].length;
		if (matrix == null || cols <= 0 || rows <= 0) {
			return result;
		}

		int start = 0;
		while (cols > start * 2 && rows > start * 2) {
			helper(matrix, cols, rows, start, result);
			start++;
		}
		return result;
	}

	public void helper(int[][] matrix, int cols, int rows, int start,
			List<Integer> result) {
		int endX = cols - 1 - start;
		int endY = rows - 1 - start;
		for (int i = start; i <= endX; i++) {
			int number = matrix[start][i];
			result.add(number);
		}
		if (start < endY) {
			for (int i = start + 1; i <= endY; i++) {
				int number = matrix[i][endX];
				result.add(number);
			}
		}

		if (start < endX && start < endY) {
			for (int i = endX - 1; i >= start; i--) {
				int number = matrix[endY][i];
				result.add(number);
			}
		}

		if (start < endX && start < endY - 1) {
			for (int i = endY - 1; i >= start + 1; i--) {
				int number = matrix[i][start];
				result.add(number);
			}

		}

	}
}
