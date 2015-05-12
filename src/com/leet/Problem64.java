package com.leet;

public class Problem64 {
	public int minPathSum(int[][] grid) {
		if (grid == null)
			return 0;
		int row = grid.length;
		int col = grid[0].length;
        for (int i = 1; i < row; i++) {
			grid[i][0]= grid[i][0]+grid[i-1][0];
		}
        for (int j = 1; j < col; j++) {
        	grid[0][j]= grid[0][j]+grid[0][j-1];
		}
        
        for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				grid[i][j]= Math.min(grid[i-1][j], grid[i][j-1])+grid[i][j];
				
			}
		}
		
		return grid[row-1][col-1];
	}

}
