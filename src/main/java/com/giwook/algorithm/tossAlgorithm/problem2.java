package com.giwook.algorithm.tossAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 93Hong on 2020-08-01
 *
 */
public class problem2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(test(input));
	}

	private static boolean test(String input) {
		String[] strings = input.split(" ");
		int[] intArray = new int[strings.length];

		for (int i = 0; i < strings.length; i++) {
			try {
				intArray[i] = Integer.parseInt(strings[i]);
			} catch (Exception exception) {
				return false;
			}
		}

		int before = intArray[0];
		if (isInRange(before))
			return false;

		Set<Integer> integerSet = new HashSet<>();
		integerSet.add(before);

		for (int i = 1; i < intArray.length; i++) {
			int current = intArray[i];
			if (isInRange(current)) {
				return false;
			}
			if (before > current) {
				return false;
			}
			if (integerSet.contains(current)) {
				return false;
			}
			integerSet.add(current);
			if (integerSet.size() > 6) {
				return false;
			}

			before = current;
		}
		return integerSet.size() == 6;
	}

	private static boolean isInRange(int number) {
		return number < 1 || number > 45;
	}

}
