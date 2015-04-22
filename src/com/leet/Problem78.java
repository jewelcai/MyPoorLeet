package com.leet;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Problem78 {
	public static List<List<Integer>> subsets(int[] S) {
	      
	      Arrays.sort(S);
		return sub(S,0);
		
	    }
	
	
	public static List<List<Integer>> sub(int[] S,int index)
	{    List<List<Integer>> totalList= new ArrayList<List<Integer>>();
		if(index==S.length)
		{
		   totalList.add(new ArrayList<Integer>());
		   return totalList;
		}
		
		List<List<Integer>> totalList2=sub(S,index+1);
			for (int i = 0; i < totalList2.size(); i++) {
				totalList.add(totalList2.get(i));
				List<Integer> tempList= new ArrayList<Integer>();
				tempList.add(S[index]);
				tempList.addAll(totalList2.get(i));
				totalList.add(tempList);
				//totalList.add(totalList.get(i).add(S[index-1]));
				
			}
			
			return totalList;
		
		
	}
	public static void main(String[] args) {
		int [] a= {3,2,1};
		List<List<Integer>> list=subsets(a);
		System.out.print(list);
	}
}
