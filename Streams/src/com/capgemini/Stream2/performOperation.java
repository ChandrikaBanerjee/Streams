/*Lambda Expression performing add,prime,palindrome operations*/
package com.capgemini.Stream2;

import java.util.function.Predicate;

public class performOperation {
	// Declaring predicates

	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = i -> {
//Logic for finding odd
			return (i % 2 == 0) ? false : true;
		};
		return predicate;
	}

	public static Predicate<Integer> isPrime() {
		Predicate<Integer> predicate = i -> {
			// Logic for finding prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					return false;
			}

			return true;

		};
		return predicate;
	}

	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> predicate = (str) -> {
			// Logic for finding palindrome or not
			return (Integer.toString(str)).equals(new StringBuilder(Integer.toString(str)).reverse().toString());
		};
		return predicate;
	}

}
