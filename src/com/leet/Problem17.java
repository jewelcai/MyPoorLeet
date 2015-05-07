package com.leet;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {
//��Ҫ�������洢ʱ  �������������  �ڶ�����Ϊhelper  ���е�һ������Ϊ��Ҫ������
	/**
	 * @param digits  ���������
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
 * @param letters ���֌������ַ���
 * @param list  ��һ�ε�result
 * @return ���ε�result
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
