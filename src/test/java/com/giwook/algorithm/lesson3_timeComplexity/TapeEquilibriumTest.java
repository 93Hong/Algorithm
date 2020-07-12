package com.giwook.algorithm.lesson3_timeComplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-07-12
 *
 */
class TapeEquilibriumTest {

	@Test
	void test() {
		int[] A = {3, 1, 2, 4, 3};
		System.out.println(new TapeEquilibrium().solution(A));
	}

}