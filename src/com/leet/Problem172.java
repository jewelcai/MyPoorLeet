package com.leet;

public class Problem172 {

   public static int trailingZeroes(int n) {
//	   int countOftwo=0;
//	   int countOfFive=0;
//	   int countOften=0;
//	   int countOfTrailingZero=0;
//	   if(n<4) return 0;
//        for (int i = 2; i <=n; i++) {
//        	
//        	if(i%10==0) countOften++;
//        	else if(i%2==0) countOftwo++;
//        	else if(i%5==0) countOfFive++;
//        	
//        				
//		}
//        countOfTrailingZero=
//        		(countOftwo<countOfFive?countOftwo:countOfFive)+countOften;
//        return countOfTrailingZero;
	   int count = 0;
	   while(n>1)
	   {
		   count +=n/5;
		   n/=5;
		   
	   }
        return count;
    }
	
   public static int jiecheng(int n)
   {  
	   int result=1;
	   for (int i = 1; i <= n; i++) {
		result*=i;
		   
	}
	   return result;
   }
   
   
   public static void main(String[] args) {
	long i = trailingZeroes(10);
	System.out.print(i+"");
	
}
}
