package com.giwook.algorithm.lesson5_prefixSum;

/**
 *
 * @author 93Hong on 2020-09-06
 *
 */
public class CountDiv {
	public static int solution(int A, int B, int K) {
		// write your code in Java SE 8
		int result = B / K;
		result -= (A / K);

		if (A % K == 0) {
			result++;
		}

		return result;
	}
}
