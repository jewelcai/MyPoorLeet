package com.leet;

public class Problem168 {
public static String convertToTitle(int n) {
    String book = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    if(n==0) return null;
    int index;
    StringBuilder s=new StringBuilder();
	while(n!=0)
        {  
        	
        	index= n%26;
        	if(index!=0)
        		{s.append(book.charAt(index-1));
        		
        		}
        	else{
        		s.append('Z');
        		n=n/26-1;
        		continue;
        	}
        	//if(index==0) {s.append(book.charAt(book.length()-1));}
        	n/=26; 
        	
        	
    }
	s.reverse();
	return s.toString();
	
	
}

public static void main(String[] args) {
	String s= convertToTitle(26);
	System.out.print(s);
}
}
