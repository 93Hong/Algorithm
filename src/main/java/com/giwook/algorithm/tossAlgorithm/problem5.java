package com.giwook.algorithm.tossAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author 93Hong on 2020-08-01
 *
 */
public class problem5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();
		test(input, input2);
	}

	private static void test(String input, String input2) {
		String[] kimStrings = input.split(" ");
		String[] leeStrings = input2.split(" ");

		int[] kimIntArray = new int[kimStrings.length];
		int[] leeIntArray = new int[leeStrings.length];
		int[] tempIntArray = new int[leeStrings.length];

		for (int i = 0; i < kimStrings.length; i++) {
			kimIntArray[i] = Integer.parseInt(kimStrings[i]);
			leeIntArray[i] = Integer.parseInt(leeStrings[i]);
		}

		for (int i = 0; i < kimIntArray.length; i++) {
			if (i > 0) {
				tempIntArray[i] = tempIntArray[i - 1];
			}

			int kimPay = kimIntArray[i];
			int leePay = leeIntArray[i];

			if (kimPay + tempIntArray[i] >= leePay) {
				System.out.print(kimPay + tempIntArray[i] - leePay);
				tempIntArray[i] = 0;
			} else {
				tempIntArray[i] += kimPay - leePay;
				System.out.print(0);
			}

			if (i != kimIntArray.length - 1) {
				System.out.print(" ");
			}
		}

	}

}
