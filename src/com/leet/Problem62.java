package com.leet;

public class Problem62 {
    static int count =0;
    public static void up(int m,int n, int x,int y)
    {
    	if(m==x&&y==n)
    	{
    		count ++;
    		return ;
    		
    	}
    	if(x<=m&&y<=n)
    	{
    		int x1=x;
    		int y1=y;
    		if(x<m)
    		{
    			x1++;
    			up(m,n,x1,y);
    		}
    		
    		if(y<n)
    		{
    			y1++;
    			up(m,n,x,y1);
    		}
    	}
    	
    	
    }
	public static int uniquePaths(int m, int n) {
     int [][] store = new int[m][n];
     for (int i = 0; i < m; i++) {
		store[i][0]=1;
	}
     for (int j = 0; j < n; j++) {
		store[0][j]=1;
	}
     
     for (int i = 1; i <m; i++) {
		for (int j = 1; j < n; j++) {
			store[i][j]= store[i-1][j]+store[i][j-1];
		}
	}
     
     return store[m-1][n-1];
	}

	public static void main(String[] args) {
		 up(3,3,0,0);
		System.out.println(count);
	}
}
