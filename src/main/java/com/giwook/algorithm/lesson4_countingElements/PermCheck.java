package com.giwook.algorithm.lesson4_countingElements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 93Hong on 2020-09-06
 *
 */
public class PermCheck {

	public int solution(int[] A) {
		// write your code in Java SE 8

		Set<Integer> integers = new HashSet<>();

		for (int i : A) {
			if (i > A.length)
				return 0;

			if (integers.contains(i))
				return 0;

			integers.add(i);
		}

		return 1;
	}

}
