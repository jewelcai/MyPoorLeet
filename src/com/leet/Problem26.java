package com.leet;

public class Problem26 {
	public static int removeDuplicates(int[] A) {
	if(A.length==0||A==null) return 0;
//        int p=0;
//        int p1=1;
//        int length=A.length;
//        while(p<length&&p1<length)
//        {
//        	if(A[p]==A[p1])
//        	{
//        		for (int i = p1; i < length-1; i++) {
//					A[i]=A[i+1];
//        			}
//        		length--;
//        	}else{
//        		p++;
//        		p1++;
//        	}
//        	
//        	
//        }	
//        		
//        return length;
	
        if(A == null) return 0;
        int count = 0;
        for(int i = 0; i < A.length; ++i){
            if(count == 0 || A[i] != A[count-1]){
                A[count] = A[i];
                count++;
            }
        }
        return count;
    }

	
	
	public static void main(String[] args) {
		int[] A= {1,1,1,1,1,1,1,1,2,2,3,3};
		int i =removeDuplicates(A);
		System.out.print(i);
	}
	
	}

