package com.leet;

import java.util.Stack;

public class Problem150 {

	 public int evalRPN(String[] tokens) {
		 Stack<Integer> s= new Stack<Integer>();
	     for (int i = 0; i < tokens.length; i++) {
	    	int op1,op2;
			if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/"))
			{
				if(tokens[i].equals("+"))
				{
					op1= s.pop();
					op2=s.pop();
					s.push(op1+op2);
					
				}else if(tokens[i].equals("-"))
				{
					op1= s.pop();
					op2=s.pop();
					s.push(op2-op1); 
				}else if(tokens[i].equals("*"))
				{
					op1= s.pop();
					op2=s.pop();
					s.push(op2*op1); 
				}else if(tokens[i].equals("/"))
				{
					op1= s.pop();
					op2=s.pop();
					s.push(op2/op1); 
				}
				
			}else{
				
				s.push(Integer.parseInt(tokens[i]));
				
			}
	    	 
	    	 
		}   
	     return s.pop();
	    }

}
