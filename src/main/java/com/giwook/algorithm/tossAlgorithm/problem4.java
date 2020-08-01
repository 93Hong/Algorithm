package com.giwook.algorithm.tossAlgorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author 93Hong on 2020-08-01
 *
 */
public class problem4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		test(input);
	}

	private static void test(String input) {
		String[] strings = input.split(" ");

		Set<String> orderedSet = new LinkedHashSet<>();
		for (String bank : strings) {
			orderedSet.remove(bank);
			orderedSet.add(bank);
			Iterator<String> itr = new LinkedList<>(orderedSet).descendingIterator();
			int cnt = 0;
			while(itr.hasNext() && ++cnt < 6) {
				String nextBank = itr.next();
				if (itr.hasNext()) {
					System.out.print(nextBank + " ");
				} else {
					System.out.print(nextBank);
				}
			}
			System.out.println();
		}

	}

}
