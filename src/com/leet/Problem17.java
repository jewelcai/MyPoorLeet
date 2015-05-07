package com.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {
//需要用容器存储时  最好有两个函数  第二个作为helper  其中的一个参数为需要的容器
	/**
	 * @param digits  输入的数字
	 * @return
	 */
	public static List<String> letterCombinations(String digits) {
		String digitletter[] = { "", "", "abc", "def", "ghi", "jkl", "mno",
				"pqrs", "tuv", "wxyz" };
		List<String> result = new ArrayList<String>();
		if(digits.length()==0||digits==null)
		{
			return result;
		}
		result.add("");
		for (int i = 0; i < digits.length(); i++) {
			result = combineHelper(digitletter[digits.charAt(i)-'0'], result);
		}
		
	return result;
	}
   /**
 * @param letters 數字對應的字符串
 * @param list  上一次的result
 * @return 本次的result
 */
public static List<String> combineHelper(String letters, List<String> list)
   {
	List<String> result = new ArrayList<String>();
	for (int i = 0; i < letters.length(); i++) {
		for (String tmp : list) {
			result.add(tmp+letters.charAt(i));
		}
	}
	   
	   return result;
   }

public static void main(String[] args) {
	List<String> res= new ArrayList<String>();
	res=letterCombinations("234");
	System.out.println(res);
}
}
