package com.leet;

import java.util.List;

public class Problem14 {
public String longestCommonPrefix(List<String> strs) {
   if(strs==null||strs.size()==0)
	   return "";
   String pre = strs.get(0);
   int i =1;
   while(i<strs.size()){
	   while(strs.get(i).indexOf(pre)!=0)//说明不是字串的关系
	   {
		   pre= pre.substring(0, pre.length()-1);
		   
	   }
	   i++;//然后找下一个字符串
	   
   }
	
   return pre;
    }
   
   
//   public static void main(String[] args) {
//	String [] s= {"abcd","abc","ab"};
//	   String s1= longestCommonPrefix(s);
//	   
//	   System.out.print(s1);
//}
}
