package com.leet;

public class Problem67 {
  public static String addBinary(String a, String b) {
//	  StringBuilder builder= new StringBuilder();
//	  int maxLength=a.length()>b.length()?a.length():b.length();
//	  int aI[]= new int[maxLength];
//      int bI[]= new int [maxLength];
//                
//        for (int i = maxLength-1; i >=0; i--) {
//			aI[i]= a.charAt(i);
//			bI[i]= b.charAt(i);
//			
//        }
//        
//        int carry=0;
//        int ma=aI.length-1;
//        int mb=bI.length-1;
//        while(ma>=0)
//        {
//        	aI[ma]=(aI[ma]+bI[mb]+carry)%2;
//        	carry= (aI[ma]+bI[mb]+carry)/2;
//        	ma--;
//        	mb--;
//        }
//        if(carry==0)
//        {
//        	for (int i = 0; i < aI.length; i++) {
//				builder.append(aI[i]);
//			}
//        	
//        	return builder.toString();
//        }else{
//        	
//        	int[] newA= new int[aI.length+1];
//        	newA[0] = carry;
//        	for (int i = 1; i < newA.length; i++) {
//				newA[i]=aI[i-1];
//			}
//        	
//        	for (int i = 0; i < newA.length; i++) {
//				builder.append(newA[i]);
//			}
//        	return builder.toString();
//        }
//        
        int maxLength = a.length()>b.length()?a.length():b.length();
        StringBuilder builder = new StringBuilder();
        int carry=0;
        for (int i = 0; i <maxLength; i++) {
			int aElement=0;
			int bElement=0;
			if(i<a.length()) aElement= Integer.parseInt(a.substring(a.length()-i-1, a.length()-i));
			if(i<b.length()) bElement= Integer.parseInt(b.substring(b.length()-i-1, b.length()-i));
			builder.append((aElement+bElement+carry)%2);
			carry = (aElement+bElement+carry)/2;
		}
        if(carry==1)
        	builder.append(carry);
        return builder.reverse().toString();
     }
  
  public static void main(String[] args) {
	  String s= addBinary("01", "1111");
	  System.out.println(s);
}
}
