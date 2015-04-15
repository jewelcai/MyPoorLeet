package com.leet;
import java.util.*;
public class Problem118 {
public List<List<Integer>> generate(int numRows) {
     
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	if (numRows==0) return result;
	List<Integer> firstRow = new ArrayList<Integer>();
	firstRow.add(1);
	result.add(firstRow);
	for(int i=1;i<numRows;i++)
	{
		List<Integer> cur = new ArrayList<Integer>();
		cur.add(1);
		List<Integer> pre = result.get(i-1);
		for (int j = 0; j < pre.size()-1; j++) {
			cur.add(pre.get(j)+pre.get(j)+1);
		}
		cur.add(1);
		result.add(cur);
	}
	return result;
	
    }


}
