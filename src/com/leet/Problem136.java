package com.leet;

public class Problem136 {
public int singleNumber(int[] A) {//XOR is a self_inverse operation 
	//which operated twice is equivalent to operated zero time;
    int result=0;
    for (int i = 0; i < A.length; i++) {
		result=result^A[i];
	}
	return result;
	
    }
}
