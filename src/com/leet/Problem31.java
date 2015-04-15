package com.leet;

public class Problem31 {
	 
public static String countAndSay(int n) {
  
	if(n==1) return "1";
	String s= countAndSay(n-1);
	StringBuffer sb = new StringBuffer();
	while(s.length()>0)
	{
		int index=0;
		char c = s.charAt(index);
		while(index+1<s.length()&&c==s.charAt(index+1))
		{
			index++;
			
		}
		sb.append(String.valueOf(index+1)+c);
		s= s.substring(index+1);
		
	}
  return sb.toString();
}
	
		

public static void main(String[] args) {
	String s= countAndSay(6);
	System.out.print(s);
}
}
