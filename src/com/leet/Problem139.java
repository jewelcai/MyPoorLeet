package com.leet;

import java.util.Set;

public class Problem139 {
	public boolean wordBreak(String s, Set<String> wordDict) {
		boolean store[] = new boolean[s.length() + 1];
		store[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (store[j] == true && wordDict.contains(s.substring(j, i))) {
					store[i] = true;
					break;
				}
			}
		}
		return store[s.length()];
	}
}
