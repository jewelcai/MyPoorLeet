package com.leet;



public class Problem5 {
   public static String longestPalindrome(String s) {
	   if(s==null||s.length()==0) return "";
	   String result=s.substring(0, 1);
	   	   
	   for(int i=0; i<s.length();i++)
	   {
		   String temp1=expandFromCenter(s,i,i);
		   if(temp1.length()>result.length())
			   result =temp1;
		   
		   String temp2 = expandFromCenter(s, i, i+1);
		   if(temp2.length()>result.length())
			   result =temp2;
		   
	   }
	   
	   return result;
              }
   
   
   
   public static String expandFromCenter(String s, int i,int j)
   {
	   int left=i;
	   int right=j;
	   while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
	   {
		   left--;
		   right++;
		   
	   }
	   return s.substring(left+1, right);
	   
   }
   
   public static void main(String[] args) {
	 String s= longestPalindrome("abccba");
	 System.out.print(s);
	 
	   
	   
}
   
   
}
