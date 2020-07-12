package com.giwook.algorithm.lesson2;

import com.giwook.algorithm.lesson2_arrays.OddArray;
import org.junit.jupiter.api.Test;

/**
 *
 * @author 93Hong on 2020-07-12
 *
 */
class OddArrayTest {

	@Test
	void test() {
		int[] A = {9, 3, 9, 3, 9, 7, 9, 7, 11};

		OddArray oddArray = new OddArray();
		System.out.println(oddArray.solution(A));
	}

}