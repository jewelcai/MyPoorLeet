package com.leet;

public class Problem91 {

	public int numDecodings(String s) {
		if (s == null || s.length() == 0||s.charAt(0)=='0')
			return 0;
		int len = s.length();
		char[] nums = s.toCharArray();
		int[] store = new int[len];
		store[0] = 1;
		for (int i = 1; i < len; i++) {
           store[i]= store[i-1];
			if(nums[i]=='0'&&(nums[i-1]<'1'||nums[i-1]>'2'))
				return 0;
			
			if(nums[i-1]=='1'&&nums[i]!='0'&&((i+1<len&&nums[i+1]!='0')||i+1==len))
			{
				store[i] += i-2>0?store[i-2]:1;
				
			}
			
			if(nums[i-1]=='2'&&nums[i]>'0'&&nums[i]<'7')
			{
				store[i] +=i-2>0?store[i-2]:1;
			}
			
		}
  return store[len-1];
	}
}
