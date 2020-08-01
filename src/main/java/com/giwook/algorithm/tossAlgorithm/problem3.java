package com.giwook.algorithm.tossAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 93Hong on 2020-08-01
 *
 */
public class problem3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		test(input);
	}

	private static void test(String input) {
		String[] strings = input.split(" ");
		int[] intArray = new int[strings.length];

		Map<Integer, Integer> integerMap = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			int number = Integer.parseInt(strings[i]);
			intArray[i] = number;
			if (!integerMap.containsKey(number)) {
				integerMap.put(number, compute(number));
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < intArray.length - 1; i++) {
			stringBuilder.append(integerMap.get(i)).append(" ");
		}
		stringBuilder.append(integerMap.get(intArray.length - 1));
		System.out.println(stringBuilder.toString());
	}

	private static Integer compute(int number) {
		return null;
	}
}
