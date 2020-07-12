package com.giwook.algorithm.lesson2;

import java.util.Arrays;

/**
 *
 * @author 93Hong on 2020-07-12
 *
 */
public class OddArray {
	public int solution(int[] A) {

		Arrays.sort(A);
		int i = 0;
		for (; i < A.length - 1; i += 2) {
			if (A[i] != A[i + 1])
				break;
		}

		return A[i];
	}
}
