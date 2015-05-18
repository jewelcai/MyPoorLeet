package com.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem46 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(result, nums,0);
		return result;
	}

	public void helper(List<List<Integer>> result, int[] nums, int index) {

		if (index >= nums.length) {
			List<Integer> current = new ArrayList<Integer>();
			for (int a : nums) {
				current.add(a);
			}
			result.add(current);
		} else {
			for (int i = index ; i < nums.length; i++) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
				helper(result, nums, index + 1);

				int temp1 = nums[i];
				nums[i] = nums[index];
				nums[index] = temp1;

			}

		}

	}
}
