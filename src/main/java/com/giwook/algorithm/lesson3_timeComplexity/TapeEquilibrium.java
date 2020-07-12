package com.giwook.algorithm.lesson3_timeComplexity;

/**
 *
 * @author 93Hong on 2020-07-12
 *
 */
public class TapeEquilibrium {
	public int solution(int[] A) {
		// write your code in Java SE 8

		int sum = 0;
		int result = Integer.MAX_VALUE;
		for (int i : A) {
			sum += i;
		}

		int temp = 0;
		for (int i = 0; i < A.length - 1; i++) {
			temp += A[i] * 2;
			final int difference = Math.abs(sum - temp);
			if (difference < result) {
				result = difference;
			}
		}

		return result;
	}
}
