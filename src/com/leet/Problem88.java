package com.leet;

public class Problem88 {
 public void merge(int A[], int m, int B[], int n) {
     if(m==0)
    	 A= B;
     else{
	 int pa=0,pb=0;
        while(pa<m&&pb<n)
        {
        	if(B[pb]>A[pa])
        	{
        		for (int i = pa; (i +1)< A.length; i++) {
					
        			A[i+1]=A[i];
				}
        		A[pa]=B[pb];
        		pb++;
        		
        	}
        	pa++;
        }
        
        while(pb<n)
        {
        	A[pa]= B[pb];
        	pa++;
        	pb++;
        }
        
    }}
}
