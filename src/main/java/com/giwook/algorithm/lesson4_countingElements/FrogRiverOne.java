package com.giwook.algorithm.lesson4_countingElements;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 93Hong on 2020-07-18
 *
 */
public class FrogRiverOne {

	public int solution(int X, int[] A) {
		Set<Integer> set = new HashSet<>(X);
		int i;
		for (i = 0; i < A.length; i++) {
			set.add(A[i]);
			int size = set.size();
			if (size == X) {
				break;
			}
		}

		if (set.size() != X) {
			return -1;
		}
		return i;
	}

}
