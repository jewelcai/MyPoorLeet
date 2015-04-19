package com.leet;

public class Problem53 {

	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			if(sum>=max)
				max=sum;
			if(sum<0){
				sum=0;
			}
		}
		  return max;  
		}
       
	
public static void main(String[] args) {
	int a[] ={-2,1,-3,4,-1,2,1,-5,4};
	int b = maxSubArray(a);
	System.out.println(b);
	
}
}
