package com.leet;

public class Problem69 {

	public static int mySqrt(int x) {
		if(x==0)
		{
			return 0;
		}
		
		int left = 0;
		int right = Integer.MAX_VALUE;

		while (left < right) {
			int mid = (left + right) / 2;
			int div = x / mid;
			if (div == mid)
				return mid;
			else if (div > mid)
				left = mid + 1;
			else
				right = mid ;
		}
		return left - 1;
	}

	public static void main(String[] args) {
     int x= 1;
    int a =mySqrt( x);
    System.out.println(a);
	}
}
