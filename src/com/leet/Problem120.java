package com.leet;

import java.util.List;

public class Problem120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0)
			return 0;
		// int[] store = new int[triangle.size()];
		// store[0] = triangle.get(0).get(0);
		// int pos = 0;
		// for (int i = 1; i < store.length; i++) {
		// store[i] = store[i - 1]
		// + Math.min(triangle.get(i).get(pos),
		// triangle.get(i).get(pos + 1));
		// pos = triangle.get(i).get(pos) < triangle.get(i).get(pos + 1) ? pos
		// : pos + 1;
		// }
		// return store[store.length - 1];
		int[] store = new int[triangle.size()];
		for (int i = 0; i < store.length; i++) {
			store[i] = triangle.get(triangle.size() - 1).get(i);
		}

		for (int i = store.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				store[j] = Math.min(store[j], store[j + 1])
						+ triangle.get(i - 1).get(j);
			}
		}

		return store[0];

	}
}
