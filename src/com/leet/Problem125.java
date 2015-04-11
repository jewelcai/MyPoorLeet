package com.leet;
import java.util.*;
public class Problem125 {
    public static boolean isPalindrome(String s) {
    	if(s==null||s.length()==0)  return false;
    	String s1=s.toLowerCase();
    	boolean b= true;
        LinkedList<Character> list = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s1.charAt(i))
					||Character.isDigit(s1.charAt(i)))
				list.add(s1.charAt(i));
        	       	
		}
        while(list.size()>1)
        {
        	if(list.removeFirst()!=list.removeLast())
        	{b=false;
        		break;
        	     	}
        	
        }
        
        return b;
		}
    
    public static void main(String[] args) {
		
    	boolean b=isPalindrome("1a12");
    	System.out.print(b);
	}
    
    }

