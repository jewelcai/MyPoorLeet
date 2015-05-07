package com.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cz
 *¿ÉÒÔ”U³äµ½ksums
 *
 */
public class Problem18 {
	/**
	 * @param nums
	 * @param target
	 * @return
	 */
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums.length < 4)
			return result;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-3; i++) {
			if(i==0||i>0&&nums[i]!=nums[i-1])
			{
				for (int j = i+1; j <nums.length-2; j++) {
					if(j==i+1||j>i+1&&nums[j]!=nums[j-1]){
						int up = j+1;
						int down = nums.length-1;
						int tmp = target- nums[i]-nums[j]; 
						while(up<down)
						{
							if(tmp == nums[up]+nums[down])
							{   
								result.add(Arrays.asList(nums[i],nums[j],nums[up],nums[down]));
								while(up<down&&nums[up]==nums[up+1]){ up++;}
								while(up<down&&nums[down]==nums[down-1]){ down--;}
								up++;
								down--;
							}
							else if (tmp > nums[up]+nums[down])
							{
								 up++;
							}else{
								down--;
							}
						}
					}
				}
			}
		}
return result;
	}
	
	public static void main(String[] args) {
		int [] nums = {-1,0,1,2,-1,-4};
		int target= 0;
		List<List<Integer>> res= fourSum(nums, target) ;
		System.out.println(res);
	}
}
