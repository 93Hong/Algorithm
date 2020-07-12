package com.giwook.algorithm.lesson3_timeComplexity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-07-12
 *
 */
class PermMissingElemTest {

	@Test
	void test() {
		int[] A = {2, 3, 1, 5};
		System.out.println(new PermMissingElem().solution(A));
	}
}