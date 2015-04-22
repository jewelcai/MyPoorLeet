package com.leet;

public class Problem35 {

	public int searchInsert(int[] A, int target) {
        if(A==null||A.length==0)
        	return 0;
        if(A[0]>target)
        	return 0;
        if(A[A.length-1]<target) return A.length;
		int left= 0;
		int right= A.length-1;
		
		while(left<right)
		{   int mid = (left+right)/2;
			if(target==A[mid])  return mid;
			else if(target>A[mid]) left= mid+1 ;
			else right= mid;
			
		}
		return left;
	}

}
