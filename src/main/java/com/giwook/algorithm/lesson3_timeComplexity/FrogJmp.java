package com.giwook.algorithm.lesson3_timeComplexity;

/**
 *
 * @author 93Hong on 2020-07-12
 *
 */
public class FrogJmp {
	public int solution_wrong(int X, int Y, int D) {

		int currentLocation = X;
		int numberOfJumps = 0;
		while (currentLocation < Y) {
			currentLocation += D;
			numberOfJumps++;
		}

		return numberOfJumps;
	}

	public int solution(int X, int Y, int D) {

		final int difference = Y - X;
		int numberOfJumps = difference / D;
		if (numberOfJumps * D != difference) {
			numberOfJumps++;
		}

		return numberOfJumps;
	}
}
