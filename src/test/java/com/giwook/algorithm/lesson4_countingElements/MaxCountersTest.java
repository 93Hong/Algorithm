package com.giwook.algorithm.lesson4_countingElements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 *
 * @author 93Hong on 2020-07-19
 *
 */
class MaxCountersTest {

	@Test
	void test() {
		int N = 5;
		int[] A = {3, 4, 4, 6, 1, 4, 4, 6, 4, 6, 6, 1, 1, 2};

		final int[] solution = new MaxCounters().solution(N, A);
		System.out.println(Arrays.toString(solution));
	}

}