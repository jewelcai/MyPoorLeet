package com.leet;

public class Problem79 {

public boolean exist(char[][] board, String word) {
        if (word==null||word.length()==0) return false;
        char[] arr = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(helper(board, arr,i, j, 0))
					return true;
			}
		}
        return false;
    }

public boolean helper(char[][] board, char[] word,int x, int y , int index)
{
	if(index==word.length)
	{
		return true;
	}
	if(x<0||y<0||x==board.length||y==board[x].length)
		return false;//out of bound

	if(board[x][y]!=word[index]) return false;// 值不相等
	
	board[x][y]^=256;//6666666
	//
	
	boolean res= helper(board, word, x+1,y, index+1)||helper(board, word, x,y+1, index+1)||
			helper(board, word, x-1,y, index+1)||helper(board, word, x,y-1, index+1);
	
	board[x][y]^=256;
	return res;
	
}

}
