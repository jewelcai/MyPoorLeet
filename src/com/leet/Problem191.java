package com.leet;

public class Problem191 {
 public static int hammingWeight(int n)
 {
	 int count=0;
	 while(n!=0)
	 {
		 
		 n=n&(n-1);
		 count++;
	 }
	 
	 return count;
	 
 }
 
 public static void main(String[] args) {
	 //System.out.print(countOfOnes(11)+"");
}
}
