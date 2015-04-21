package com.leet;

public class Problem50 {

	public double pow(double x, int n) {
         if(n==0) return 1;
         if(n<0)
         {
        	 x=1/x;
        	 n=-n;
         }
         double result = pow(x,n/2);
         if(n%2==0) return result*result;
         else return result*result*x;
		
		
	}

}
