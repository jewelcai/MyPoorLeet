package com.leet;

public class Problem198 {
public static int rob(int[] num) {
    if(num.length<2) return num.length==0?0:num[0];
   
    	 
	int[] arr = new int[num.length];
	arr[0] = num[0];
	arr[1]= num[0]>num[1]?num[0]:num[1];
	for(int i=2;i<num.length;i++)
	{
		arr[i] = arr[i-2]+num[i];
		arr[i]= arr[i]>arr[i-1]?arr[i]:arr[i-1];
		
	}
	return arr[num.length-1];
	
    }
	
	public static void main(String[] args) {
		int [] i = {1,2,2,4,6,1};
		
		int a= rob(i);
		
		System.out.print(a+"");
	}
}
