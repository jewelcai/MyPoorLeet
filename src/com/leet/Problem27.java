package com.leet;

public class Problem27 {

	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0)
			return 0;

		int length = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[length] = nums[i];
				length++;
			}

		}
		return length;
	}

}
