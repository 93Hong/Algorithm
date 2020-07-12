package com.giwook.algorithm;

import org.junit.jupiter.api.Test;

/**
 *
 * @author 93Hong on 2020-07-04
 *
 */
class CattleTest {

	@Test
	void test() {

		int[] land = {2,2,3,4,3,3,2,2,1,1,2,5};
		boolean[] cattle = new boolean[land.length];
		cattle[0] = true;

		for (int i = 1; i < land.length; i++) {
			int prev = i - 1;

			if (cattle[prev]) {
				if (land[prev] == land[i]) {
					cattle[i] = cattle[prev];
				} else {
					cattle[i] = false;
				}

				continue;
			}

			if (land[prev] == land[i]) {
				cattle[prev] = cattle[i];

				continue;
			}

			if (land[prev] < land[i]) {
				int current = i;
				int next = i + 1;
				while (land[current] == land[next]) {
					next++;
				}
				if (land[current] > land[next]) {
					for (int a = current; a < next; a++) {
						cattle[a] = true;
					}
				}

				i = next;
				continue;
			}

			if (land[prev] > land[i]) {
				int current = i;
				int next = i + 1;
				while (land[current] == land[next]) {
					next++;
				}
				if (land[current] < land[next]) {
					for (int a = current; a < next; a++) {
						cattle[a] = true;
					}
				}

				i = next;
				continue;
			}

		}

		System.out.println(cattle);
	}

}