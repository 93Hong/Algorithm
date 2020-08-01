package com.giwook.algorithm.tossAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author 93Hong on 2020-08-01
 *
 */
public class problem1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println("Hello Goorm! Your input is " + input);

		System.out.println(test(input));
	}

	private static boolean test(String input) {
		char[] chars = input.toCharArray();
		if (chars.length == 1) {
			char current = chars[0];
			if (checkFirstRule(current != '1' && current != '2'))
				return false;
		}

		if (chars[chars.length - 1] == '1') {
			return false;
		}

		for (int i = 1; i < chars.length; i++) {
			char current = chars[i];
			if (checkFirstRule(current != '1' && current != '2'))
				return false;

			char before = chars[i - 1];
			if (before == '1') {
				if (checkFirstRule(current != '2'))
					return false;
			}
		}
		return true;
	}

	private static boolean checkFirstRule(boolean b) {
		return b;
	}

}
