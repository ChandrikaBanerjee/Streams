
/*Implementation of various operations on a lambda expression*/
package com.capgemini.Stream3;

import java.util.function.Predicate;

public class performListOfIntegers {
	// Using predicates to check even,odd,divisibility checking
	public static Predicate<Integer> isEven() {

		Predicate<Integer> predicate = i -> {
			return ((i % 2 == 0) ? true : false);
			// Logic for checking even
		};

		return predicate;
	}

	public static Predicate<Integer> isOdd() {
		Predicate<Integer> predicate = i -> {
			// Logic for checking odd
			return (i % 2 == 0) ? false : true;
		};

		return predicate;
	}

	public static Predicate<Integer> isDivisibleBy6() {
		Predicate<Integer> predicate = i -> {
			// Logic for checking is div by 6 or not
			return (i % 6 == 0) ? true : false;
		};

		return predicate;
	}

	public static Predicate<Integer> isLessThan12() {

		Predicate<Integer> predicate = i -> {
			// Logic for checking is less than 12 or not
			return (i < 12) ? true : false;
		};

		return predicate;
	}

	public static Predicate<Integer> isGreaterThan50() {
		Predicate<Integer> predicate = i -> {
			// Logic for checking is greater than 50 or not
			return (i > 50) ? true : false;
		};

		return predicate;
	}
}
