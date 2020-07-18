package com.giwook.algorithm.lesson4_countingElements;

import org.junit.jupiter.api.Test;

/**
 *
 * @author 93Hong on 2020-07-18
 *
 */
class FrogRiverOneTest {

	@Test
	void test() {
		int X = 5;
		int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(new FrogRiverOne().solution(X, A));
	}

}