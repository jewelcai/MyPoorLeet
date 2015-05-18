package com.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem72 {
	public List<List<Integer>> combine(int n, int k) {
		if (n == k || k == 0) {
			List<Integer> tmp = new ArrayList<Integer>();
			for (int i = 1; i <= k; i++) {
				tmp.add(i);
			}
			return new ArrayList<>(Arrays.asList(tmp));
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res = combine(n - 1, k - 1);
		for (List<Integer> list : res) {
			list.add(n);
		}
		res.addAll(combine(n - 1, k));

		return res;
	}

	public List<List<Integer>> helper(List<List<Integer>> res, int n, int k) {
		if (n == k || k == 0) {
			List<Integer> tmp = new ArrayList<Integer>();
			for (int i = 1; i <= k; i++) {
				tmp.add(i);
			}
			res.add(tmp);
			return res;
		}
		List<List<Integer>> last1 = helper(res, n - 1, k - 1);
		for (List<Integer> list : last1) {
			list.add(n);
		}
		last1.addAll(helper(res, n - 1, k));
		return last1;

	}

}
