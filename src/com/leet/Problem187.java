package com.leet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Problem187 {
	public List<String> findRepeatedDnaSequences(String s) {
		int len = s.length();

		List<String> result = new LinkedList<String>();
		if (len < 10)
			return result;
		int a = 0;
		int m = 1;
		for (int i = 0; i < 10; i++) {
			a = a * 4 + getCode(s.charAt(i));
			m *= 4;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> r = new HashSet<Integer>();
		set.add(a);
		int p = 10;
		while (p < len) {
			a = (a * 4 + getCode(s.charAt(p))) % m;
			if (set.contains(a) && !r.contains(a)) {
				result.add(s.substring(p - 9, p + 1));
				r.add(a);
			}else{
				set.add(a);
				
			}

			p++;
		}
		return result;
	}

	private int getCode(char c) {
		switch (c) {
		case 'A':
			return 0;

		case 'C':
			return 1;
		case 'G':
			return 2;
		case 'T':
			return 3;
		default:
			return -1;

		}

	}
}
