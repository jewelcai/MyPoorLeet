package com.leet;

public class Problem14 {
   public static String longestCommonPrefix(String[] strs) {
       int i=0;
       StringBuilder res = new StringBuilder();
         
       
       while(i<strs[0].length()){
    	   char c=  strs[0].charAt(i);
    	   boolean temp=false;
       for (int j = 0; j < strs.length; j++) {
		if(strs[j].charAt(i)!=c||strs[j].length()<i) break; 
			temp = true;
		
	}
       if(temp){
       i++;
       res.append(c);}
   }
	   return res.toString();
    }
   
   
   public static void main(String[] args) {
	String [] s= {"abcd","abc","ab"};
	   String s1= longestCommonPrefix(s);
	   
	   System.out.print(s1);
}
}
