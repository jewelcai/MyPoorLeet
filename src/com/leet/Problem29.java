package com.leet;

public class Problem29 {

	public int divide(int dividend, int divisor) {
     long result = divideLong(dividend, divisor);
     return result>Integer.MAX_VALUE?Integer.MAX_VALUE:(int)result;
	}
	
	public long divideLong(long dividend, long divisor)
	{
		boolean isNegative = dividend<0!=divisor<0;
		if(dividend<0) dividend= -dividend;
		if(divisor<0) divisor= - divisor;
		
		if(dividend<divisor)  return 0;
		
		long sum = divisor;
		long divide = 1;
		while((sum+sum <=dividend))
		{
			sum+=sum;
			divide+=divide;
		}
		
		return isNegative?-(divide+divideLong(dividend-sum,divisor)):(divide+divideLong(dividend-sum,divisor));
		
	}
}
