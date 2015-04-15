package com.leet;
import java.util.*;
public class Problem15 {
public List<List<Integer>> threeSum(int[] num) {
    Arrays.sort(num);   
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    for (int i = 0; i < num.length-2; i++) {//length-2 放置越界  而且必须需要三个数
	   if(i>0&&num[i]!=num[i-1]||i==0)
	   {
		   int target=-num[i];
		   int up=i+1;
		   int down=num.length-1;
		   while(up<down)
		   {
			   if(num[up]+num[down]==target){
				   result.add(Arrays.asList(num[i],num[up],num[down]));
			   while(up<down&&num[up]==num[up+1])  up++;
			   while(up<down&&num[down]==num[down-1])  down--;
			   up++;
			   down--;}
			   
			   else if (num[up]+num[down]<target)
				   up++;
			   else down--;
			   
		   }
		   
		   
	   }
    	
    	
    	
	}
    
	
	return result;
	
    }
}
