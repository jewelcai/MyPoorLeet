package com.leet;

public class Problem6 {

   public static String convert(String s, int nRows) {
	   char[] c= s.toCharArray();
	   StringBuilder builder= new StringBuilder(nRows);
	   if(nRows==1) return s;
	   int loop = 2*nRows-2;
	   
	   for(int i = 0;i<nRows;i++)
	   {
		   
		for (int j = 0; j <=c.length-1; j++) {
			if(j%loop==i)
			{  if((j%loop!=0&&j%loop!=nRows-1))
			  {builder.append(c[j]);
			  
				if(j+loop-2*i<c.length)
				{
				builder.append(c[j+loop-2*i]);
				
				}
			  }
			   else{
				   builder.append(c[j]);
				   
			   }
				
			}
			
			
		}   
		   
		   
	   }
	  
	   
	   return builder.toString();
	   
   }
   
public static void main(String[] args) {
	String s= convert("PAYPALISHIRING",4);
	System.out.print(s);
}
}
