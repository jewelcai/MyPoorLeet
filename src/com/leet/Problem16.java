package com.leet;

import java.util.Arrays;

public class Problem16 {

	public int threeSumClosest(int[] nums, int target) {
		int res=0; 
		
		if(nums.length<=3){
			
			for (int temp:nums) {
				res+=temp;
			}
			return res;
		}
		
		res= nums[0] + nums[1] + nums[nums.length - 1];
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {

			int up = i + 1;
			int down = nums.length - 1;
			while(up<down)
			{
				int sum = nums[i]+nums[up]+nums[down];
				if(sum>target)  down--;
				else  up++;
				
			if(sum==target){
				res=sum;
				break;
				
			}
			if(Math.abs(sum-target)<Math.abs(res-target))
				res= sum;
			}
			
			
		}
		return res;
	}
}
