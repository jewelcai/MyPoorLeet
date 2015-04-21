package com.leet;

public class Problem169 {

	public int majorityElement(int[] num) {

		int target = num[0];
		int count = 0;
		for (int i = 0; i < num.length; i++) {
           if(target==num[i])
           {
        	   count ++;
           }
           else{
        	   count--;
           }
           if(count==0)
           {
        	   target= num[i];//ºóÒÆ
        	   count =1;
           }
		}
           return target;
	}

}
