package com.giwook.algorithm.lesson3_timeComplexity;

/**
 *
 * @author 93Hong on 2020-07-12
 *
 */
public class PermMissingElem {
	public int solution(int[] A) {

		long maxNum = A.length + 1;

		long sumOfArray = 0;
		for (int i : A) {
			sumOfArray += i;
		}

		long a = maxNum * (maxNum + 1) / 2;

		return (int)(a - sumOfArray);
	}
}
