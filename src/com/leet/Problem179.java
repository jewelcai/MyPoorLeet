package com.leet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Problem179 {
	public String largestNumber(int[] nums) {
		if (nums == null) {
			return "";
		}
		String[] numStr = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numStr[i] = nums[i] + "";
		}

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1 = o1 + o2;
				String s2 = o2 + o1;

				return s2.compareTo(s1);
			}
		};

		Arrays.sort(numStr, comp);
		if (numStr[0].charAt(0) == '0') {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		for (String string : numStr) {
			sb.append(string);
		}

		return sb.toString();
	}

}
