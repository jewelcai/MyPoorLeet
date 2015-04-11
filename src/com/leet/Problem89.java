package com.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem89 {
public static List<Integer> grayCode(int n) {
       List<Integer> result = new ArrayList<Integer>();
       if(n==0) result.add(0);
//    	   return null;
       
       else{
    	   List<Integer> temp1=grayCode(n-1);
    	   List<Integer> temp2= new ArrayList<Integer>();
    	   for(int i=0;i<temp1.size();i++ )
    	   {  int j=temp1.get(temp1.size()-1-i);
    		   temp2.add(j+(int)Math.pow(2, n-1));
    		   
    	   }
     	   result.addAll(temp1);
     	   result.addAll(temp2);
    	   
       }
       
       
	return result;
	
    }

public static void main(String[] args) {
	List<Integer> list=grayCode(10);
	String s = list.toString();
	System.out.print(s);
}
}
