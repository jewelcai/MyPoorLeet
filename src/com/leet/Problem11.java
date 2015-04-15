package com.leet;
import java.util.*;
public class Problem11 {
public int maxArea(List<Integer> height) {
//     if(height==null||height.size()==0)
//    	 return 0;
//	    int max=0;
//        int temp;
//	for (int i = 0; i < height.size(); i++) {
//		
//		for (int j = i; j < height.size(); j++) {
//			temp = (j-i)*(height.get(j)<=height.get(i)?height.get(j):height.get(i));
//			if(temp>max)  max= temp;
//			
//		}
//	}
//	
//	return max;
	int max=0;
	int up=0;
	int down = height.size()-1;
	while(up<down)
	{
		max= Math.max(max, (down-up)*Math.min(height.get(up), height.get(down)));
		if(height.get(up)<height.get(down))  up++;
		else down--;
	}
	return max;
    }
}
