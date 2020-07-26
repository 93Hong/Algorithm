package com.giwook.algorithm.lesson4_countingElements;

/**
 *
 * @author 93Hong on 2020-07-18
 *
 */
public class MaxCounters {

	public int[] solution(int N, int[] A) {
		// write your code in Java SE 8

		int[] counters = new int[N];
		int max = 0;
		int lastMax = 0;
		for (int i : A) {
			if (i > N) {
				lastMax = max;
			} else {
				final int index = i - 1;
				if (counters[index] < lastMax) {
					counters[index] = lastMax + 1;
				} else {
					counters[index] = counters[index] + 1;
				}

				if (counters[index] > max) {
					max = counters[index];
				}
			}
		}

		for (int i = 0; i < counters.length; i++) {
			if (counters[i] < lastMax) {
				counters[i] = lastMax;
			}
		}

		return counters;
	}

}
