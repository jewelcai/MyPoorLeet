package com.leet;
import java.util.*;
public class Problem3 {

public static int lengthOfLongestSubstring(String s) {
    if(s.length()==0)  return 0;    
	
    int start=0; int index=0;
    int currLength=0;int maxLength=0;
    
    Map<Character,Integer> hm= new HashMap<Character,Integer>();
    while(index<s.length()-1)
    { Character currChar = s.charAt(index);
      int pre= -1;	
    
    if(hm.containsKey(currChar))
    	{
    		pre= hm.get(currChar).intValue();
    		
    	}
    
    if(pre<start){
    	hm.put(currChar, index);
    	currLength++;
    	if(currLength>maxLength)
    		maxLength=currLength;
    	
    }else{
    	start= pre+1;
    	currLength= index-start+1;
    	hm.put(currChar, index);
    	
    	
    }
    	
    	index++;
    }
	
	
	return maxLength;
    }
	
	
	public static void main(String[] args) {
		int i = lengthOfLongestSubstring("abcadcabcd");
		System.out.println(i+"");
		
	}
}
