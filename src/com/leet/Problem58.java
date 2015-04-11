package com.leet;

public class Problem58 {
	 public static int lengthOfLastWord(String s) {
		 String [] sArray= s.trim().split(" +");
		 return sArray[sArray.length-1].length();}
	 
	 public static void main(String[] args) {
		 int q =lengthOfLastWord("Hello           ");
		 System.out.print(q);
	}
}
