package com.leet;

public class Problem171 {
public static int titleToNumber(String s) {
        String chooseFrom= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(s==null||s.length()==0) return 0;
        char[] c = s.toCharArray();
        int result=0;
        for (int i = 0; i <c.length; i++) {
			for (int j = 0; j < chooseFrom.length(); j++) {
				if(c[i]==chooseFrom.charAt(j))
				{
					result=result*26+j+1;
					
				}
				
			}
		}
        return result;
    }


public static void main(String[] args) {
	int i=titleToNumber("");
	System.out.print(i);
}
}
