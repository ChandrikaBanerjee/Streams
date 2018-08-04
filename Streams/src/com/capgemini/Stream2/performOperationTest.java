package com.capgemini.Stream2;

import java.util.ArrayList;
import java.util.List;

public class performOperationTest {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		// Adding integers into collection
		for (int i = 1; i < 1000; i++) {
			arrayList.add(i);
		}
		// Calling methods and printing one by one using lambda expression
		System.out.println("Odd Number in the range of 1-1000 : ");
		arrayList.stream().filter(performOperation.isOdd()).forEach(System.out::println);

		System.out.println("Prime Number in the range of 1-1000 : ");
		arrayList.stream().filter(performOperation.isPrime()).forEach(System.out::println);

		System.out.println("Palindrome Number in the range of 1-1000 : ");
		arrayList.stream().filter(performOperation.isPalindrome()).forEach(System.out::println);
	}

}
