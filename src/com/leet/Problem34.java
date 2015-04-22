package com.leet;

public class Problem34 {

	public int[] searchRange(int[] A, int target) {
		int[] res = { -1, -1 };
		if (A == null || A.length == 0)
			return res;
		int left = 0;
		int right = A.length - 1;
		int begin;
		int end;

		if (target > A[A.length - 1] || target < A[0])
			return res;
		while (left <=right) {
			int mid = (left + right) / 2;
			if (target == A[mid]) {
				begin = end = mid;
				while (begin - 1 >= 0 && target == A[begin - 1])
					begin--;
				while (end + 1 <= A.length - 1 && target == A[end + 1])
					end++;

				res[0] = begin;
				res[1] = end;
				return res;

			} else if (target > A[mid]) {
				left=mid + 1;
			} else {
				right=mid-1;
			}

		}
		return res;
	}

}
