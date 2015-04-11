package com.leet;

public class Problem66 {
   public static int[] plusOne(int[] digits) {
      	   
	   int carry[]= new int [digits.length];
	   carry[digits.length-1]=(digits[digits.length-1]+1)/10;
	   digits[digits.length-1]= (digits[digits.length-1]+1)%10;
	   
        for (int i = digits.length-2; i >=0; i--) {
        	
        	
        	carry[i] = (digits[i]+carry[i+1])/10;
        	digits[i]= (digits[i]+carry[i+1])%10;
        	
		}
        if(carry[0]==0) return digits;
        else{
        	int [] newDigits = new int[digits.length+1];
        	newDigits[0]=carry[0];
        	for (int i = 1; i < newDigits.length; i++) {
        		newDigits[i]= digits[i-1];
			}
        	return newDigits;
        }
               
        
    }
   
   public static void main(String[] args) {
	int [] a={9,9,9,9};
	 int[] b=plusOne(a);
	 for (int i = 0; i < b.length; i++) {
		 System.out.print(b[i]);
	}
	 
}
}
