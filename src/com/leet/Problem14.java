package com.leet;

import java.util.List;

public class Problem14 {
public String longestCommonPrefix(List<String> strs) {
   if(strs==null||strs.size()==0)
	   return "";
   String pre = strs.get(0);
   int i =1;
   while(i<strs.size()){
	   while(strs.get(i).indexOf(pre)!=0)//˵�������ִ��Ĺ�ϵ
	   {
		   pre= pre.substring(0, pre.length()-1);
		   
	   }
	   i++;//Ȼ������һ���ַ���
	   
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
