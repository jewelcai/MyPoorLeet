package com.leet;

public class Problem96 {

	public int numTrees(int n) {
		if (n < 0)
			return 0;
		if (n <= 2)
			return n;
		int[] store = new int[n + 1];
		store[0] = 0;
		store[1] = 1;
		store[2] = 2;
		for (int i = 3; i <= n; i++) {
			store[i] = 2 * store[i - 1];
			for (int j = 1; j < i - 1; j++) {
				store[i] += store[j] * store[i - j - 1];
			}
		}
		return store[n];
	}

}
