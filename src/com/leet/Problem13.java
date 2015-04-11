package com.leet;

public class Problem13 {
   public static int romanToInt(String s) {
       char[] c = s.toCharArray(); 
	   int [] ints = new int[c.length];
	   int res=0;
	   for (int i = 0; i < ints.length; i++) {
		
		   ints[i]=convert(c[i]);
	}
	   //for (int i = 0; i < ints.length; i++) 
	   int j=0;
	   while(j<ints.length)
	   {
		   if((j+1<ints.length)&&ints[j]<ints[j+1])
		   {
			   if(ints[j]==1||ints[j]==10||ints[j]==100){
				   res=res+ints[j+1]-ints[j];
			   j+=2;}
			   
		   }else{
		   res+=ints[j];
		   j++;}
		   
	}
	   return res;
	   
    }
   public static int convert(char c)
   {
	   switch (c) {
	case 'I':
		return 1;
	case 'V':
		return 5;
	case 'X':
		return 10;
	case 'L':
		return 50;
	case 'C':
		return 100;
	case 'D':
		return 500;
	case 'M':
		return 1000;

	default:
		return 0;
	}
	   
	   
   }
  
	   
	public static void main(String[] args) {
		int i = romanToInt("MDCCCLXXX");
		System.out.print(i+"");
		
		
	}   
   
   
   }
   

